package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Model.DataBaseDAO;

/**
 * Servlet implementation class Science_AddAnswer
 */
@WebServlet("/Add_Answer")
public class Science_AddAnswer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Science_AddAnswer() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		DataBaseDAO obj = new DataBaseDAO();
		
		String answer = request.getParameter("a1");
		String id = request.getParameter("qid");
		String categ = request.getParameter("category");
		System.out.println(answer);
		int ansno=obj.CountAnswer();
		HttpSession session = request.getSession();
		String uid = (String) session.getAttribute("userid");
		boolean res = obj.insertAnswer("ans"+ansno, uid ,answer, categ , id );
		response.sendRedirect("answerRecorded.html");
	}

}
