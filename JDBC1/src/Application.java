import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
/*
 Steps to create jdbc app:
 
 step1 : Load Driver
 	Class.forName("oracle.jdbc.OracleDriver");
 	where,
 		jdbc - protocol
 		oracle - sub-protocol
 		thin - driver
 		@localhost - IP address of machine where Database is installed.
 		1521 - port number
 	path: C:\oraclexe\app\oracle\product\10.2.0\server\NETWORK\ADMIN\tnsnames.ora file contains info about port and service name(XE)
 
 step2 :
 		connect to database using connection Interface.
 		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","1612");
 		
 		add jar files : C:\oraclexe\app\oracle\product\10.2.0\server\jdbc\lib
 		
 */
public class Application {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String driver = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		String UserName = "system";
		String pass = "1612";
		String str;
		
		try {
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url,UserName,pass);
			System.out.println("connection to system done!"+con);
			
			do {
				System.out.println("1 : Insert\n2 : Update\n3 : Delete\n4 : Display");
				int ch = sc.nextInt();
				if(ch == 1) {
					PreparedStatement pstate = con.prepareStatement("insert into linkcode values(?, ?, ?)");
					System.out.println("Enter student id, name, perct");
					pstate.setInt(1, sc.nextInt());
					pstate.setString(2, sc.next());
					pstate.setFloat(3, sc.nextFloat());
					int i = pstate.executeUpdate();
					if(i>0) {
						System.out.println("Record Saved..");
					}
					else {
						System.out.println("Unable to save the record..");
					}
					
				}
				else if(ch == 2) {
					
					System.out.println("Enter Student id to update the record : ");
					int sid = sc.nextInt();
					System.out.println("what you want to update [1: id\t2: name\t3: percentage] : ");
					int ch1 = sc.nextInt();
					
					int i = 0;
					if(ch1==1) {
						PreparedStatement pstate = con.prepareStatement("update linkcode set id = ? where id = ?");
						pstate.setInt(2, sid);
						System.out.println("Enter new Id : ");
						int updateId = sc.nextInt();
						pstate.setInt(1, updateId);
						i = pstate.executeUpdate();
					}
					else if(ch1==2) {
						PreparedStatement pstate = con.prepareStatement("update linkcode set name = ? where id = ?");
						pstate.setInt(2, sid);
						System.out.println("Enter new Name : ");
						String updatenm = sc.next();
						pstate.setString(1, updatenm);
						i = pstate.executeUpdate();
					}
					if(ch1==3) {
						PreparedStatement pstate = con.prepareStatement("update linkcode set perct = ? where id = ?");
						pstate.setInt(2, sid);
						System.out.println("Enter new Percentage : ");
						float updateperct = sc.nextFloat();
						pstate.setFloat(1, updateperct);
						i = pstate.executeUpdate();
					}
					
					if(i>0) {
						System.out.println("Record Updated..!!");
					}
					else {
						System.out.println("Failed to Update Record..!");
					}
					
				}
				else if (ch==3) {
					System.out.println("Enter student id to delete the record : ");
					int sid = sc.nextInt();
					
					PreparedStatement pstate = con.prepareStatement("delete from linkcode where id = ?");
					pstate.setInt(1, sid);
					int i = pstate.executeUpdate();
					if(i>0) {
						System.out.println("Record Dleted!");
					}
					else {
						System.out.println("Unable to delete record!");
					}
					
				}
				else if(ch == 4) {
				
					System.out.println("Enter student id to search record : ");
					
					PreparedStatement pstate = con.prepareStatement("select * from linkcode where id = ?");
					pstate.setInt(1, sc.nextInt());
					ResultSet result = pstate.executeQuery();
					if(result.next()) {
						System.out.println(result.getInt(1)+"\t"+result.getString(2)+"\t"+result.getFloat(3));
					}
					
				}
				
				System.out.println("Do you want to continue?(Y/N) : ");
				str = sc.next();
					
			}while(str.equalsIgnoreCase("Y"));
			
		} catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();
		}
		System.out.println("Thank You!");

	}

}
