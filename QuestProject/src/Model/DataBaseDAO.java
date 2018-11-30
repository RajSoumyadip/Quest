/**
 * 
 */
package Model;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
//Defining class
	public class DataBaseDAO {
		
		public boolean AddUser(String uid, String fname, String lname, String em, String passw)
		{
			boolean result=true;
			try{
				Class.forName("com.mysql.jdbc.Driver");
				String url="jdbc:mysql://localhost:3306/QuestDB";
				String user="root";
				String pass="root";
				Connection con=(Connection) DriverManager.getConnection(url,user,pass);
				PreparedStatement ps=con.prepareStatement("Insert into User values(?,?,?,?,?)");
				ps.setString(1,uid);
				ps.setString(2, fname);
				ps.setString(3, lname);
				ps.setString(4, em);
				ps.setString(5, passw);
				
				
				ps.executeUpdate();
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
				result=false;
			}
			return result;
		}
		
		
		
		public boolean UserExists(String email , String pas)
		{
			
			int c=0;
			try {
				Class.forName("com.mysql.jdbc.Driver");
				String url="jdbc:mysql://localhost:3306/QuestDB";
				String user="root";
				String pass="root";
				Connection con=DriverManager.getConnection(url,user,pass);
				String sql="select count(user_id) from User where User.email="+"'"+email+"'"+" "+"and User.password="+"'"+pas+"'";
				PreparedStatement ps=con.prepareStatement(sql);
				ResultSet rs=ps.executeQuery();
				while(rs.next()) {
					c = rs.getInt(1);
				}
				con.close();
				
				}
				
				catch (Exception e) {
				e.printStackTrace();
			}
			if(c>=1)
				return true;
			else
				return false;
			
			
		}
		
		public String UserExistenceInfo(String email , String pas)
		{
			
			String userinfo="";
			try {
				Class.forName("com.mysql.jdbc.Driver");
				String url="jdbc:mysql://localhost:3306/QuestDB";
				String user="root";
				String pass="root";
				Connection con=DriverManager.getConnection(url,user,pass);
				String sql="select * from User where User.email="+"'"+email+"'"+" "+"and User.password="+"'"+pas+"'";
				PreparedStatement ps=con.prepareStatement(sql);
				ResultSet rs=ps.executeQuery();
				while(rs.next()) {
					userinfo = rs.getString(2)+" "+ rs.getString(3);
				}
				con.close();
				
				}
				
				catch (Exception e) {
				e.printStackTrace();
			}
			return userinfo;
			
			
		}
		public String UserExistenceID(String email , String pas)
		{
			
			String userinfo="";
			try {
				Class.forName("com.mysql.jdbc.Driver");
				String url="jdbc:mysql://localhost:3306/QuestDB";
				String user="root";
				String pass="root";
				Connection con=DriverManager.getConnection(url,user,pass);
				String sql="select * from User where User.email="+"'"+email+"'"+" "+"and User.password="+"'"+pas+"'";
				PreparedStatement ps=con.prepareStatement(sql);
				ResultSet rs=ps.executeQuery();
				while(rs.next()) {
					userinfo = rs.getString(1);
				}
				con.close();
				
				}
				
				catch (Exception e) {
				e.printStackTrace();
			}
			return userinfo;
			
			
		}
		
		
		public boolean insertQues(String id, String uid, String cat, String ques)
		{
			boolean result=true;
			try{
				Class.forName("com.mysql.jdbc.Driver");
				String url="jdbc:mysql://localhost:3306/QuestDB";
				String user="root";
				String pass="root";
				Connection con=(Connection) DriverManager.getConnection(url,user,pass);
				PreparedStatement ps=con.prepareStatement("Insert into Question_Post values(?,?,?,?)");
				ps.setString(1,id);
				ps.setString(2, uid);
				ps.setString(3, cat);
				ps.setString(4, ques);
				
				ps.executeUpdate();
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
				result=false;
			}
			return result;
		}
		
		public int CountQuestion()
		{
			int c=0;
			try {
				Class.forName("com.mysql.jdbc.Driver");
				String url="jdbc:mysql://localhost:3306/QuestDB";
				String user="root";
				String pass="root";
				Connection con=DriverManager.getConnection(url,user,pass);
				String sql="select count(question) from Question_Post";
				PreparedStatement ps=con.prepareStatement(sql);
				ResultSet rs=ps.executeQuery();
				while(rs.next()) {
					c = rs.getInt(1);
				}
				con.close();
				
				} 
				catch (Exception e) {
				e.printStackTrace();
			}
			return c;
			
		}
		
		public int CountAnswer()
		{
			int c=0;
			try {
				Class.forName("com.mysql.jdbc.Driver");
				String url="jdbc:mysql://localhost:3306/QuestDB";
				String user="root";
				String pass="root";
				Connection con=DriverManager.getConnection(url,user,pass);
				String sql="select count(answer) from Answer_Post";
				PreparedStatement ps=con.prepareStatement(sql);
				ResultSet rs=ps.executeQuery();
				while(rs.next()) {
					c = rs.getInt(1);
				}
				con.close();
				
				} 
				catch (Exception e) {
				e.printStackTrace();
			}
			return c;
			
		}
		
		public int CountUser()
		{
			int c=0;
			try {
				Class.forName("com.mysql.jdbc.Driver");
				String url="jdbc:mysql://localhost:3306/QuestDB";
				String user="root";
				String pass="root";
				Connection con=DriverManager.getConnection(url,user,pass);
				String sql="select count(last_name) from User";
				PreparedStatement ps=con.prepareStatement(sql);
				ResultSet rs=ps.executeQuery();
				while(rs.next()) {
					c = rs.getInt(1);
				}
				con.close();
				
				} 
				catch (Exception e) {
				e.printStackTrace();
			}
			return c;
			
		}
		
		public boolean insertAnswer(String id, String uid, String ans, String cat, String ques_id)
		{
			boolean result=true;
			try{
				Class.forName("com.mysql.jdbc.Driver");
				String url="jdbc:mysql://localhost:3306/QuestDB";
				String user="root";
				String pass="root";
				Connection con=(Connection) DriverManager.getConnection(url,user,pass);
				PreparedStatement ps=con.prepareStatement("Insert into Answer_Post values(?,?,?,?,?)");
				ps.setString(1,id);
				ps.setString(2, uid);
				ps.setString(3, ans);
				ps.setString(4, cat);
				ps.setString(5, ques_id);
				
				ps.executeUpdate();
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
				result=false;
			}
			return result;
		}
		
		public ArrayList<String> QuestionOfUser(String uid)
		{
			String content="";
			String chk="";
			ArrayList<String> temp = new ArrayList<String>();
			try {
				Class.forName("com.mysql.jdbc.Driver");
				String url="jdbc:mysql://localhost:3306/QuestDB";
				String user="root";
				String pass="root";
				Connection con=DriverManager.getConnection(url,user,pass);
				String sql="Select * from Question_Post where Question_Post.ques_user_id='"+uid+"'";
				PreparedStatement ps=con.prepareStatement(sql);
				ResultSet rs=ps.executeQuery();
				while(rs.next()) {
					content =rs.getString(1)+":"+rs.getString(4);
					temp.add(content);
				}
				con.close();
				
				} 
				catch (Exception e) {
				e.printStackTrace();
			}
			return temp;
		}
		
		public ArrayList<String> AnswerOfUser(String uid)
		{
			String content="";
			String chk="";
			ArrayList<String> temp = new ArrayList<String>();
			try {
				Class.forName("com.mysql.jdbc.Driver");
				String url="jdbc:mysql://localhost:3306/QuestDB";
				String user="root";
				String pass="root";
				Connection con=DriverManager.getConnection(url,user,pass);
				String sql="Select * from Answer_Post where Answer_Post.ans_ques_id='"+uid+"'";
				PreparedStatement ps=con.prepareStatement(sql);
				ResultSet rs=ps.executeQuery();
				while(rs.next()) {
					content =rs.getString(3);
					temp.add(content);
				}
				con.close();
				
				} 
				catch (Exception e) {
				e.printStackTrace();
			}
			return temp;
		}

		public ArrayList<String> ShowAllQuestionCareer()
		{
			
			String content="";
			String chk="";
			ArrayList<String> temp = new ArrayList<String>();
			try {
				Class.forName("com.mysql.jdbc.Driver");
				String url="jdbc:mysql://localhost:3306/QuestDB";
				String user="root";
				String pass="root";
				Connection con=DriverManager.getConnection(url,user,pass);
				String sql="Select * from Question_Post where Question_Post.category='Career'";
				PreparedStatement ps=con.prepareStatement(sql);
				ResultSet rs=ps.executeQuery();
				while(rs.next()) {
					content =rs.getString(1)+" "+ "#Asked By @"+rs.getString(2)+": :"+rs.getString(4);
					temp.add(content);
				}
				con.close();
				
				} 
				catch (Exception e) {
				e.printStackTrace();
			}
			return temp;
		}
		
		public boolean insertAnswerCareer(String id, String uid, String ans, String cat, String ques_id)
		{
			boolean result=true;
			try{
				Class.forName("com.mysql.jdbc.Driver");
				String url="jdbc:mysql://localhost:3306/QuestDB";
				String user="root";
				String pass="root";
				Connection con=(Connection) DriverManager.getConnection(url,user,pass);
				PreparedStatement ps=con.prepareStatement("Insert into Answer_Post values(?,?,?,?,?)");
				ps.setString(1,id);
				ps.setString(2, uid);
				ps.setString(3, ans);
				ps.setString(4, cat);
				ps.setString(5, ques_id);
				
				ps.executeUpdate();
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
				result=false;
			}
			return result;
		}
		
		public ArrayList<String> ShowAllAnswersCareer(String id)
		{
			
			String content="";
			String chk="";
			ArrayList<String> temp = new ArrayList<String>();
			try {
				Class.forName("com.mysql.jdbc.Driver");
				String url="jdbc:mysql://localhost:3306/QuestDB";
				String user="root";
				String pass="root";
				Connection con=DriverManager.getConnection(url,user,pass);
				String sql="select * from Answer_Post left join User on Answer_Post.ans_user_id=User.user_id where category='Career'and ans_ques_id="+"'"+id+"'";          ;
				PreparedStatement ps=con.prepareStatement(sql);
				ResultSet rs=ps.executeQuery();
				while(rs.next()) {
					content ="Answered By @"+rs.getString(7)+" "+rs.getString(8)+": :"+rs.getString(3);
					temp.add(content);
				}
				con.close();
				
				} 
				catch (Exception e) {
				e.printStackTrace();
			}
			return temp;
		}

		
		public ArrayList<String> ShowAllQuestionScience()
		{
			
			String content="";
			String chk="";
			ArrayList<String> temp = new ArrayList<String>();
			try {
				Class.forName("com.mysql.jdbc.Driver");
				String url="jdbc:mysql://localhost:3306/QuestDB";
				String user="root";
				String pass="root";
				Connection con=DriverManager.getConnection(url,user,pass);
				String sql="Select * from Question_Post where Question_Post.category='Science'";
				PreparedStatement ps=con.prepareStatement(sql);
				ResultSet rs=ps.executeQuery();
				while(rs.next()) {
					content =rs.getString(1)+" "+ "#Asked By @"+rs.getString(2)+": :"+rs.getString(4);
					temp.add(content);
				}
				con.close();
				
				} 
				catch (Exception e) {
				e.printStackTrace();
			}
			return temp;
		}
		
		public ArrayList<String> ShowAllAnswers(String id)
		{
			
			String content="";
			String chk="";
			ArrayList<String> temp = new ArrayList<String>();
			try {
				Class.forName("com.mysql.jdbc.Driver");
				String url="jdbc:mysql://localhost:3306/QuestDB";
				String user="root";
				String pass="root";
				Connection con=DriverManager.getConnection(url,user,pass);
				String sql="select * from Answer_Post left join User on Answer_Post.ans_user_id=User.user_id where category='Science'and ans_ques_id="+"'"+id+"'";          
				PreparedStatement ps=con.prepareStatement(sql);
				ResultSet rs=ps.executeQuery();
				while(rs.next()) {
					content ="Answered By @"+rs.getString(7)+" "+rs.getString(8)+": :"+rs.getString(3);
					temp.add(content);
				}
				con.close();
				
				} 
				catch (Exception e) {
				e.printStackTrace();
			}
			return temp;
		}
		
		public String DisplayQuestionScience(String id)
		{
			String temp="";
			try {
				Class.forName("com.mysql.jdbc.Driver");
				String url="jdbc:mysql://localhost:3306/QuestDB";
				String user="root";
				String pass="root";
				Connection con=DriverManager.getConnection(url,user,pass);
				String sql="select * from Question_Post left join User on Question_Post.ques_user_id = User.user_id where ques_id=" + "'" + id+ "'"+ "and Question_Post.category = 'Science'";
				PreparedStatement ps=con.prepareStatement(sql);
				ResultSet rs=ps.executeQuery();
				while(rs.next()) {
					temp ="Asked By @"+rs.getString(6)+" "+rs.getString(7)+": :"+rs.getString(4);
					
				}
				con.close();
				
				} 
				catch (Exception e) {
				e.printStackTrace();
			}
			return temp;
			
		}
		
		public String DisplayQuestion(String id)
		{
			String temp="";
			try {
				Class.forName("com.mysql.jdbc.Driver");
				String url="jdbc:mysql://localhost:3306/QuestDB";
				String user="root";
				String pass="root";
				Connection con=DriverManager.getConnection(url,user,pass);
				String sql="select * from Question_Post left join User on Question_Post.ques_user_id = User.user_id where ques_id=" + "'" + id+ "'";
				PreparedStatement ps=con.prepareStatement(sql);
				ResultSet rs=ps.executeQuery();
				while(rs.next()) {
					temp ="Asked By @"+rs.getString(6)+" "+rs.getString(7)+": :"+rs.getString(4);
					
				}
				con.close();
				
				} 
				catch (Exception e) {
				e.printStackTrace();
			}
			return temp;
			
		}
		
		public ArrayList<String> ShowAllQuestionPolitics()
		{
			
			String content="";
			String chk="";
			ArrayList<String> temp = new ArrayList<String>();
			try {
				Class.forName("com.mysql.jdbc.Driver");
				String url="jdbc:mysql://localhost:3306/QuestDB";
				String user="root";
				String pass="root";
				Connection con=DriverManager.getConnection(url,user,pass);
				String sql="Select * from Question_Post where Question_Post.category='Politics'";
				PreparedStatement ps=con.prepareStatement(sql);
				ResultSet rs=ps.executeQuery();
				while(rs.next()) {
					content =rs.getString(1)+" "+ "#Asked By @"+rs.getString(2)+": :"+rs.getString(4);
					temp.add(content);
				}
				con.close();
				
				} 
				catch (Exception e) {
				e.printStackTrace();
			}
			return temp;
		}
		
		public ArrayList<String> ShowAllQuestionSports()
		{
			
			String content="";
			String chk="";
			ArrayList<String> temp = new ArrayList<String>();
			try {
				Class.forName("com.mysql.jdbc.Driver");
				String url="jdbc:mysql://localhost:3306/QuestDB";
				String user="root";
				String pass="root";
				Connection con=DriverManager.getConnection(url,user,pass);
				String sql="Select * from Question_Post where Question_Post.category='Sports'";
				PreparedStatement ps=con.prepareStatement(sql);
				ResultSet rs=ps.executeQuery();
				while(rs.next()) {
					content =rs.getString(1)+" "+ "#Asked By @"+rs.getString(2)+": :"+rs.getString(4);
					temp.add(content);
				}
				con.close();
				
				} 
				catch (Exception e) {
				e.printStackTrace();
			}
			return temp;
		}
		
	

	}



