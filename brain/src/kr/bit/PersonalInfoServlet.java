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
			gender="남";
		}else if (gender.equals("female")) {
			gender="여";
		}else {
			gender="기타";
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
		out.println("<title>비번이 그대로 나오는 개인정보</title>");
		out.println("</head>");
		out.println("<body>");
		out.printf("이름 : %s<br>",name);
		out.printf("아이디 : %s<br>",id);
		out.printf("암호 : %s<br>",password);
		out.printf("성별 : %s<br>",gender);
		out.printf("공지 메일 : %s<br>",noticeToHangul(inotice));
		out.printf("광고 메일 : %s<br>",noticeToHangul(cnotice));
		out.printf("배송 확인 메일 : %s<br>",noticeToHangul(dnotice));
		out.printf("직업 : %s<br>",job);
		out.println("</body>");
		out.println("</html>");
	}

	private String noticeToHangul(String notice)
	{
		if(notice==null){
			return "받지 않음";
		}
		else if(notice.equals("on")){
			return "받음";
		}
		return notice;
	}

}
