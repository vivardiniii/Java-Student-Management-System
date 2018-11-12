import java.io.Serializable;
import java.util.*;

public abstract class Event implements Serializable {
	
	Date d;
	Faculty f = new Faculty();

	String name;
	String details;
	
	
	Event(){}
	
public void setName(String name) {
		
		this.name = name;
	}
	
	public void setDate(int year, int month, int date) {
		this.d = new Date(year, month, date);
		
	}
	
	
	public void setFaculty(Faculty f) {
		
		this.f =f;
		
	}
	
	
	public void setDetails(String details) {
		
		this.details = details;
	}
	
	
	public void display() {
		
		
		
		System.out.println("EVENT: "+ name);
		System.out.println("DATE OF EVENT: "+ d);
		f.display();
		System.out.println("DETAILS: "+ details);
		
		
		
		
		
		
	}
	
	
	
	
	

}
