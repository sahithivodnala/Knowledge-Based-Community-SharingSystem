import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import javaproject.javaproject.ProfileBean;
import javaproject.javaproject.ProfileBean;


@WebServlet("/AddQuestionServlet")
public class AddQuestionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String questionmsg = null;

	/**
	 * Default constructor.
	 */
	public AddQuestionServlet() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//    response.getWriter().append("Served at: ").append(request.getContextPath());

		HttpSession hs = request.getSession();
		String questionmsg = request.getParameter("qtext");
		String UserName = (String)hs.getAttribute("un");
		PrintWriter out = response.getWriter();
		out.println();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String qid=request.getParameter("qid");
		HttpSession hs = request.getSession();
		String questionmsg = request.getParameter("qtext");
		String UserName = (String)hs.getAttribute("un");
				
		ProfileBean l = new ProfileBean(questionmsg, UserName);
		l.setQuestionmsg(questionmsg);

		ProfileDaoImpl ldi = new ProfileDaoImpl();
		//  ArrayList<ProfileBean>qList = ldi.getAllQuestions();
		//request.setAttribute("qList", qList);
		//request.getRequestDispatcher("showQuestions.jsp").forward(request, response);

		if (ldi.insert(l, UserName)) {   
			out.print("Your question is posted");
			request.getRequestDispatcher("Profile.jsp").include(request, response);
			
		} else {
			out.print("Your question is not posted");
			request.getRequestDispatcher("Login.jsp").include(request, response);
		}

}
}