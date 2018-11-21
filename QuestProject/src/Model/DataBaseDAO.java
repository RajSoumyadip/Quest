/**
 * 
 */
package Model;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

	public class DataBaseDAO {

		public boolean insertRecord(String c,String c1,String top,String rel)
		{
			boolean result=true;
			try{
				Class.forName("com.mysql.jdbc.Driver");
				String url="jdbc:mysql://localhost:3306/SoftwareEngineering";
				String user="root";
				String pass="root";
				Connection con=(Connection) DriverManager.getConnection(url,user,pass);
				PreparedStatement ps=con.prepareStatement("Insert into Data values(?,?,?,?)");
				ps.setString(1, c);
				ps.setString(2, c1);
				ps.setString(3, top);
				ps.setString(4, rel);
				ps.executeUpdate();
			}catch(Exception ex)
			{
				ex.printStackTrace();
				result=false;
			}
			return result;
		}

	}



