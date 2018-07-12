

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import javaproject.javaproject.LoginBean;
import javaproject.javaproject.LoginDAOImpl;
import javaproject.javaproject.RegisterBean;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stubString Password = request.getParameter("Password");
		String FirstName = request.getParameter("FirstName");
		String LastName = request.getParameter("LastName");
		String Email = request.getParameter("Email");
		String Username = request.getParameter("Username");
		String Password = request.getParameter("Password");
		String ContactNo = request.getParameter("ContactNo");
		String RollType = request.getParameter("RollType");		
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
		String FirstName = request.getParameter("FirstName");
		String LastName = request.getParameter("LastName");
		String Email = request.getParameter("Email");
		String Username = request.getParameter("Username");
		String Password = request.getParameter("pwd");
		String ContactNo = request.getParameter("ContactNo");
		String RollType = request.getParameter("RollType");
		
		System.out.println(Username+ " "+Password);
		RegisterBean rb = new RegisterBean();
		rb.setUserName(Username);
		rb.setPassword(Password);
		LoginDAOImpl ldi = new LoginDAOImpl();
		System.out.println(rb);
		if ((rb = ldi.verify(rb)) != null) {
			
			HttpSession  hs = request.getSession();
			hs.setAttribute("user", rb);
			hs.setAttribute("un", Username);
			
			response.sendRedirect("Profile.jsp");
			//out.println("Welcome " +  Username);
		} else {
			out.print("Invalid username or password");
			request.getRequestDispatcher("Login.jsp").include(request, response);
		}
	}

}
