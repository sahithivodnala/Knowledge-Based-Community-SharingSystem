import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import javaproject.javaproject.AnswerBean;
import javaproject.javaproject.AnswerDAOImpl;

@WebServlet("/AnswerServlet")
public class AnswerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AnswerServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession hs = request.getSession();
		String answertext = request.getParameter("atext");
		String  Uname = (String)hs.getAttribute("un");
		PrintWriter out = response.getWriter();
		out.println();
	}


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		HttpSession hs = request.getSession();
		String answertext = request.getParameter("atext");
		String  Uname = (String)hs.getAttribute("un");
		int qid = Integer.parseInt((String)request.getParameter("qid"));
		AnswerBean l = new AnswerBean();
		l.setAnswertext(answertext);

		AnswerDAOImpl ldi = new AnswerDAOImpl();
		if (ldi.insert(l,  Uname,qid)) {   
				out.println("Your answer is posted");
			request.getRequestDispatcher("Profile.jsp").include(request, response);
		} else {
			out.print("Your answer is not posted");
	//		   request.getRequestDispatcher("Login.jsp").include(request, response);
		}
	}
}

