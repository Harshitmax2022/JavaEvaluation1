package question1;

public class Main {

	// String is immutable in java 
	// the reason is simple to provide the security to the data.
	// ex- if the string is not immutable anyone when access the data
	// after accesing the data easily modified it also 
	// and other users then getting a wrong data 
	// beacause someone chenged the data already
	// so to prevent the modifing the data 
	// java made the String as a immutable so that no one 
	// can modified it 
	// only access it. 
	
	
	// Difference between String and String Builder
	
	// the main differnece between string and string builder is 
	// we can not modified the string but we can modified the String Builder
	
	
	public static void main(String[] argus){
		
		// The five String method of String method of String CLass is Fallowes->
		
		//1.
		
		String name="Harshit";
		
		//2nd
		
		String name2=new String("Harshit");
		
		//3rd 
		
		String name3="Harshit";
		name.length();
		
		//4th
		
		String name4="Harshit";
		name.charAt(0);
		
	   
		//5th
		
		String name5="Harshit";
		name.toLowerCase();
		
		
		

		
	}
	
}
