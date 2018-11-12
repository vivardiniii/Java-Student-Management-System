import java.util.*;
import java.io.*;
public class Student extends Person implements Serializable {

	ArrayList <Class> Classes = new ArrayList <Class>();
	ArrayList <Event> Events = new ArrayList <Event>();
	EventList e;
	Schedule s;
	String roll;
	String course;
	int semester;
	
	Student(){}
	
	
	Student(String r, int s, String c){
		
		roll = r;
		semester = s;
		course = c;
	}
	
	public void setClasses(ArrayList <Class> c) {
		
		Classes = c;
		
		
	}
	
	public void setEvents(ArrayList <Event> e) {
		
		Events= e;
		
		
	}
	
public Class findClass(String n) {
		
		Class t = new Class();
		
		for(Class c: Classes) {
			
			
			if(c.name.equals(n)) 
				
				t =c;
				
		}
		
		return t;
	}
	
	
	public void setRollNumber(String roll) {
		
		this.roll = roll;
	}
	
	public void setSem(int n) {
		
		semester = n;
	}
	
	public void setCourse(String c){
		
		course = c;
	}
	
public Event findEvent(String n) {
		
		Event t = new ServiceEvent();
		
		for(Event e: Events) {
			
			
			if(e.name.equals(n)) {
				
				t =e;
				
			}	
		}
		
		
		return t;
	}
	
	
	
	public void displayStudentDetails() {
		
		
		displayPersonalDetails();
		System.out.println("ROLL NUMBER: " + roll);
		System.out.println("SEMESTER: " + semester);
		System.out.println("COURSE: " + course);
	}
	
	public void displayClasses() {
		
		for(Class c: Classes) {
			
			
			System.out.println("STUDENT NAME: " + this.name);
			System.out.println("ROLL NUMBER: " + this.roll);
			c.display();
			
		}
		
	}
		
		
		public void displayClassNames() {
			
			for(Class c: Classes) {
				
				System.out.println(c.name);
			}
			
			
		}
		
	
	
	public void displayEvents() {
		
		for(Event e: Events) {
			System.out.println("STUDENT NAME: " + this.name);
			System.out.println("ROLL NUMBER: " + this.roll);
			
			
			e.display();
			
		}
		
	}
	
	
}
