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
import javaproject.javaproject.QuestionBean;
import javaproject.javaproject.QuestionDisplayDAOImpl;


@WebServlet("/QuestionDispalyServlet")
public class QuestionDispalyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
    public QuestionDispalyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        HttpSession hs = request.getSession();
        String questionmsg = request.getParameter("qtext");
        String UserName = (String)hs.getAttribute("un");
        QuestionBean q = new QuestionBean(questionmsg, UserName);
        q.setQuestionmsg(questionmsg);
      
        QuestionDisplayDAOImpl qdi = new QuestionDisplayDAOImpl();
        ArrayList<QuestionBean> qList = qdi.getAllQuestions();
        request.setAttribute("qList", qList);
        request.getRequestDispatcher("showQuestions.jsp").forward(request, response);
        
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        HttpSession hs = request.getSession();
        String questionmsg = request.getParameter("qtext");
        String UserName = (String)hs.getAttribute("un");
        QuestionBean q = new QuestionBean(questionmsg, UserName);
        q.setQuestionmsg(questionmsg);
      
        QuestionDisplayDAOImpl qdi = new QuestionDisplayDAOImpl();
        ArrayList<QuestionBean> qList = qdi.getAllQuestions();
        request.setAttribute("qList", qList);
        request.getRequestDispatcher("showQuestions.jsp").forward(request, response);
                }
		
	}

