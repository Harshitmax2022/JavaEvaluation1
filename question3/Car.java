package question3;

public class Car {

	String model;
	String companyName;
	String color;
	String engine;
	
	Car(){
		
	}
	
	Car (String model, String companyName, String color, String engine){
	    this.model=model;
	    this.companyName=companyName;
	    this.color=color;
	    this.engine=engine;
	}
	
	public class Engine{
		int rmp;
		int power;
		String manufacturer;
		Boolean hasTurbo=false;
	}
	
	public void turbo(boolean tur){
		 
		Engine engine=new Engine();
		engine.hasTurbo=tur;
		
		
	}
	
	//not able to proceed it further //
}
