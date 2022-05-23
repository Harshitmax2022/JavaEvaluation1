package question4;

import java.util.Scanner;
public class Main {

	
	
	public static void main(String[] argus) {
		
		Scanner scan =new Scanner(System.in);
      
		System.out.println("Enter the number of student you want to enter");
		int number=scan.nextInt();
		System.out.println("**************************************************");
		
		int i=1;
		while(number>=i) {
			

			System.out.println("Enter the rollNumber");
			int roll=scan.nextInt();
			
			scan.nextLine();
			System.out.println("Enter the studentName");
			String name=scan.nextLine();
			
			System.out.println("Enter the Marks");
			int marks=scan.nextInt();
			
			
			Student d1= new Student(roll,name,marks);
			
		
		  System.out.println("StudentDetails"+"0"+i);
		  
		  System.out.println("Student Roll Number :"+d1.getRollNumber());
		  System.out.println("Student Name :"+d1.getStudentName());
		  System.out.println("Student Marks :"+d1.getMarks());
			
		  System.out.println("******************************************");
		  i++;
		}
		
		
	}
}
