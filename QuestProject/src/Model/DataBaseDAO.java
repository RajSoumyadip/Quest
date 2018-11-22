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

		public String ShowAllQuestionCareer()
		{
			String content="";
			try {
				Class.forName("com.mysql.jdbc.Driver");
				String url="jdbc:mysql://localhost:3306/QuestDB";
				String user="root";
				String pass="root";
				Connection con=DriverManager.getConnection(url,user,pass);
				String sql="Select * from Question_Post where category='Career' ";
				PreparedStatement ps=con.prepareStatement(sql);
				ResultSet rs=ps.executeQuery();
				while(rs.next())
					content = content + (
							rs.getString(2)+" "+rs.getString(4));
				con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			return content;
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
				String sql="select * from Question_Post qp left join Answer_Post ap on qp.ques_id = ap.ans_ques_id";
				PreparedStatement ps=con.prepareStatement(sql);
				ResultSet rs=ps.executeQuery();
				while(rs.next()) {
					String ques_id = rs.getString(1);
					if(chk.equals(ques_id)==true)
					{
						content =("Answered By: @"+rs.getString(6)+ ": :"+rs.getString(7));
						temp.add(content);
						System.out.println(content);
					}
					else {
					content =("Asked By @ "+
							rs.getString(2)+" : "+rs.getString(4)+" Answered By: @"+rs.getString(6)+ ": :"+rs.getString(7));
					System.out.println(content);
				temp.add(content);
				}
					chk = ques_id;
				}
				con.close();
				
				} 
				catch (Exception e) {
				e.printStackTrace();
			}
			return temp;
		}
		
		
		public String ShowAllQuestionPolitics()
		{
			String content="";
			try {
				Class.forName("com.mysql.jdbc.Driver");
				String url="jdbc:mysql://localhost:3306/QuestDB";
				String user="root";
				String pass="root";
				Connection con=DriverManager.getConnection(url,user,pass);
				String sql="Select * from Question_Post where category='Politics' ";
				PreparedStatement ps=con.prepareStatement(sql);
				ResultSet rs=ps.executeQuery();
				while(rs.next())
					content = content + (rs.getString(1)+" "+
							rs.getString(2)+" "+rs.getString(4));
				con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			return content;
		}
		
		public String ShowAllQuestionSports()
		{
			String content="";
			try {
				Class.forName("com.mysql.jdbc.Driver");
				String url="jdbc:mysql://localhost:3306/QuestDB";
				String user="root";
				String pass="root";
				Connection con=DriverManager.getConnection(url,user,pass);
				String sql="Select * from Question_Post where category='Sports' ";
				PreparedStatement ps=con.prepareStatement(sql);
				ResultSet rs=ps.executeQuery();
				while(rs.next())
					content = content + (rs.getString(1)+" "+
							rs.getString(2)+" "+rs.getString(4));
				con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			return content;
		}

	}



