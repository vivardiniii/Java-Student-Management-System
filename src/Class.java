import java.io.Serializable;

public class Class implements Serializable {
	
	Faculty f = new Faculty();
	String name;
	String code;
	Grades g;
	Attendance a;
	
	Class(){}
	
	
	Class(String name, String code, Faculty f){
		this.f = f;
		this.name = name;
		this.code = code;
		
	}

		
	Class(Faculty f, String name, String code, Grades g, Attendance a){
		
		this.f = f;
		this.name = name;
		this.code = code;
		this.g = g;
		this.a = a;
		
		
	}
	
	public void setGrades(Grades g) {
		
		this.g=g;
	}
	
	public void setAttendance(Attendance a) {
		
		this.a = a;
	}
	
	public void setName(String name) {
		
		this.name = name;
	}
	
	
	public void setCode(String code) {
		
		this.code = code;
	}
	
	
	public void setFaculty(Faculty f) {
		
		this.f = f;
	}
	
	public void display() {
		
		
		System.out.println("CLASS: "+ name);
		System.out.println("COURSE CODE: "+ code);
		f.display();
		g.display();
		a.display();
		
		
	}
	
	

}
