package kr.bit;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PersonalInfoServlet
 */
@WebServlet("/pinfo-result")
public class PersonalInfoServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		String gender = request.getParameter("gender");
		if(gender.equals("male")){
			gender="��";
		}else if (gender.equals("female")) {
			gender="��";
		}else {
			gender="��Ÿ";
		}
		
		String inotice = request.getParameter("inotice");
		String cnotice = request.getParameter("cnotice");
		String dnotice = request.getParameter("dnotice");
		String job = request.getParameter("job");
		
		
		//
		response.setContentType("text/html; charset=utf-8"); //euc-kr
		PrintWriter out = response.getWriter();
		out.println("<Html>");
		out.println("<head>");
		out.println("<title>����� �״�� ������ ��������</title>");
		out.println("</head>");
		out.println("<body>");
		out.printf("�̸� : %s<br>",name);
		out.printf("���̵� : %s<br>",id);
		out.printf("��ȣ : %s<br>",password);
		out.printf("���� : %s<br>",gender);
		out.printf("���� ���� : %s<br>",noticeToHangul(inotice));
		out.printf("���� ���� : %s<br>",noticeToHangul(cnotice));
		out.printf("��� Ȯ�� ���� : %s<br>",noticeToHangul(dnotice));
		out.printf("���� : %s<br>",job);
		out.println("</body>");
		out.println("</html>");
	}

	private String noticeToHangul(String notice)
	{
		if(notice==null){
			return "���� ����";
		}
		else if(notice.equals("on")){
			return "����";
		}
		return notice;
	}

}