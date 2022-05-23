package question2;
 import java.util.Scanner;
public class Course {

	int id;
	String name;
	int fee;
	
	public void displayCourseDetails() {
		System.out.println("id :"+id);
		System.out.println("Name:"+name);
		System.out.println("Fee:"+fee);
		
	}
	
	public static void authenticate(String username, String password){
		
		Course course=new Course();
		 
		Scanner  scan=new Scanner(System.in);
		
		System.out.println("Enter the userId");
		
	int idvalue=scan.nextInt();
		
	scan.nextLine();
		System.out.println("Enter the Username");
		String nameValue=scan.nextLine();
		
		System.out.println("Enter the fee");
		int feeValue=scan.nextInt();
		
	    if(username =="Admin" && password=="1234") {
	    	
	    	course.id=idvalue;
	    	course.name=nameValue;
	    	course.fee=feeValue;
	    	
	    	course.displayCourseDetails();
	    }
	    else {
	    	System.out.println("Invalid Username or password");
	    }
		
		
	}
		
		
	
	
	public static void main(String[] argus){
		
	//1st check	
		
//		authenticate("Admin", "1234");		
		
	
	//2nd check
		authenticate("addminn", "1234");	
	}
}
