import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javaproject.javaproject.ProfileBean;
import javaproject.javaproject.RegisterBean;
import javaproject.javaproject.RegisterDAOImpl;
@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Register() {
		super();
		// TODO Auto-generated constructor stub
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String FirstName = request.getParameter("FirstName");
        String LastName = request.getParameter("LastName");
        String Email = request.getParameter("Email");
        String UserName = request.getParameter("UserName");
        String Password = request.getParameter("Password");
        String ContactNo = request.getParameter("ContactNo");
        String RollType = request.getParameter("RollType");
        
        RegisterBean l = new RegisterBean();
        l.setFirstName(FirstName);
        l.setLastName(LastName);
        l.setEmail(Email);
        l.setUserName(UserName);
        l.setPassword(Password);
        l.setContactNo(ContactNo);
        l.setRollType(RollType);
        
        RegisterDAOImpl ldi = new RegisterDAOImpl();
        if (ldi.insert(l)) {   
            out.print("Successfully registered ");
            request.getRequestDispatcher("Login.jsp").include(request, response);
        } else {
           // out.print("not inserted");
          // request.getRequestDispatcher("Login.jsp").include(request, response);
        }
    }
		
}