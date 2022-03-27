import java.sql.*;
public class Details {
	
	public static void main(String[] args) {
		Person obj=new Person();		
		try {
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/naren","root","5499");
			Statement state=con.createStatement();
			String query="INSERT INTO USERS (emailId,nameof,age) VALUES ('"+obj.getEmailId()+"','"+obj.getName()+"','"+obj.getAge()+"')";
			state.executeUpdate(query); 
			System.out.println("Completed");
			ResultSet result=state.executeQuery("Select * FROM USERS");
					while(result.next()){
						for(int i=1;i<=3;i++) {
							System.out.print(result.getString(i)+"  ");
						}
						System.out.println();
					}
		}catch(Exception e) {
			
		}
	}

}
