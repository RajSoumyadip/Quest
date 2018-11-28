package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.DataBaseDAO;

/**
 * Servlet implementation class Politics_AddQuestion
 */
@WebServlet("/Add_Question_Politics")
public class Politics_AddQuestion extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Politics_AddQuestion() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		DataBaseDAO obj = new DataBaseDAO();
		String question = request.getParameter("t1");
		
		int quesno = obj.CountQuestion();
		boolean res = obj.insertQues("qsc"+quesno, "102", "Politics", question);
		response.sendRedirect("Politics.jsp");
	}

}