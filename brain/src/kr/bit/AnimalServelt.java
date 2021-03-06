package kr.bit;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.channels.SeekableByteChannel;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class AnimalServelt
 */
@WebServlet("/animal")
public class AnimalServelt extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AnimalServelt() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String animal = request.getParameter("animal");
		System.out.println(animal);
			HttpSession session = request.getSession(); // 세션 호출
			session.setAttribute("animal", animal);
			response.setContentType("text/html;charset=euc-kr"); //인코딩 어떻게 하라고 알려줌
			PrintWriter out = response.getWriter();
			out.println("<Html>");
			out.println("<head>");
			out.println("<title> ananimal</title>");
			out.println("</head>");
			out.println("<body>");
			out.println("<form action=\"result\">");
			out.println("<INPUT TYPE=TEXTFIELD NAME=food>");
			out.println("<INPUT TYPE=SUBMIT VALUE='확인'>");
			out.println("</body>");
			out.println("</html>");
	}



}
