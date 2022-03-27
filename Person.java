import java.util.*;
public class Person {
	private String name;
	private int age;
	private String emailId;
	Scanner in=new Scanner(System.in);
Person(){
	System.out.print("Enter Email Id : ");
	this.emailId=in.nextLine();
	System.out.print("Enter name of person : ");
	this.name=in.nextLine();
	System.out.print("Enter age of person : ");
	this.age=in.nextInt();
}
int getAge() {
	return age;
}
String getName() {
	return name;
}
String getEmailId() {
	return emailId;
} 
}
