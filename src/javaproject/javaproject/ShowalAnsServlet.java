package javaproject.javaproject;
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

@WebServlet("/ShowalAnsServlet")
public class ShowalAnsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowalAnsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        HttpSession hs = request.getSession();
        //String answertext = request.getParameter("atext");
        int qid = Integer.parseInt(request.getParameter("qid"));
        System.out.println(qid);
        QuestionBean qb = new QuestionBean();
        qb.setQid(qid);
        ShowalAnsDAOImpl qdi = new ShowalAnsDAOImpl();
        ArrayList<AnswerBean> aList = qdi.getAllAnswers(qb);
        request.setAttribute("aList", aList);
        request.getRequestDispatcher("showAnswers.jsp").forward(request, response);
        
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        HttpSession hs = request.getSession();
        //String answertext = request.getParameter("atext");
        int qid = Integer.parseInt(request.getParameter("qid"));
        AnswerBean q = new AnswerBean();
        //q.setAnswertext(answertext);
      
        ShowalAnsDAOImpl qdi = new ShowalAnsDAOImpl();
        //ArrayList<AnswerBean> qList = qdi.getAllAnswers();
        //request.setAttribute("qList", qList);
        //request.getRequestDispatcher("showAnswers.jsp").forward(request, response);
                }
	}

