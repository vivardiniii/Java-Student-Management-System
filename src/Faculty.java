import java.util.*;
import java.io.*;

public class Faculty extends Person {
	
	
	String department;

	
	
	Faculty(){}
	
	Faculty(String name, String department){
		
		this.department = department;

		this.name = name;
	}
	

	
	public void setDepartment(String department) {
		
		this.department = department;
	}
	

	
	public void display() {
		
		
		
		System.out.println("FACULTY NAME: " + name);
		System.out.println("FACULTY DEPARTMENT: " + department);
		
		
	}
	

	

	
	public void editStudentDetails(StudentList l, String roll) {
		
		Student s = l.findStudent(roll);
		
		s.displayStudentDetails();

		System.out.println("1: EDIT COURSE");
		System.out.println("2: EDIT SEMESTER");
		Scanner p = new Scanner(System.in);
		int n = p.nextInt();
		
		switch(n) {
		
	
		
		case 1: {
			
			System.out.println("ENTER NEW COURSE");
			Scanner q = new Scanner(System.in);
			s.setCourse(q.nextLine());
			s.displayStudentDetails();
			break;
			
			
		}
		
		case 2: {
			
			System.out.println("ENTER NEW SEMESTER");
			Scanner q = new Scanner(System.in);
			s.setSem(q.nextInt());
			s.displayStudentDetails();
			break;
			
			
		}
		}
		
	}
		
		
		
	
	
	public void editStudentClass(StudentList l, String roll) {
		
		Student s = l.findStudent(roll);
		
		s.displayClasses();
		
		System.out.println("ENTER CLASS TO CHANGE: ");
		Scanner o = new Scanner(System.in);
		String name = o.nextLine();
		
		Class d = s.findClass(name);
		
		
		
		System.out.println("1: EDIT CLASS NAME");
		System.out.println("2: EDIT CLASS CODE");
		System.out.println("3: EDIT FACULTY");

		Scanner p = new Scanner(System.in);
		int n = p.nextInt();
		
		switch(n) {
		
		case 1:{
			
			System.out.println("ENTER NEW CLASS NAME");
			Scanner q = new Scanner(System.in);
			d.setName(q.nextLine());
			d.display();
			break;
		}
		
		case 2: {
			
			System.out.println("ENTER NEW CLASS CODE");
			Scanner q = new Scanner(System.in);
			d.setCode(q.nextLine());
			d.display();
			break;
			
			
		}
		
		case 3: {
			
			System.out.println("ENTER FACULTY (NAME DEPARTMENT");
			Scanner q = new Scanner(System.in);
			String g = q.nextLine();
			String words[] = g.split(",");
			d.setFaculty(new Faculty(words[0], words[1]));
			d.display();
			break;
			
			
		}
		}
		
		
		
		
		
	}
	
	
	public void editEventList(StudentList l, String roll) {
		
		Student s = l.findStudent(roll);
		
		s.displayEvents();
		
		Scanner p = new Scanner(System.in);
		
		System.out.println("ENTER NAME OF EVENT TO BE CHANGED: ");
		Event e = s.findEvent(p.nextLine());
		
		
		System.out.println("1: EDIT EVENT NAME");
		System.out.println("2: EDIT EVENT DATE");
		System.out.println("3: EDIT EVENT FACULTY");
		System.out.println("4: EDIT EVENT DETAILS");
	
		int n = p.nextInt();
		
		
		
		switch(n) {
		
		case 1:{
			
			System.out.println("ENTER EVENT NAME");
			Scanner q = new Scanner(System.in);
			e.setName(q.nextLine());
			e.display();
			break;
			}
		
		
		case 2:{
			
			System.out.println("ENTER EVENT DATE (YEAR MONTH DATE)");
			Scanner q = new Scanner(System.in);
			e.setDate(q.nextInt(), q.nextInt(), q.nextInt());
			e.display();
			break;
			}
			
		case 3:{
			
			System.out.println("ENTER EVENT FACULTY (NAME DEPARTMENT");
			Scanner q = new Scanner(System.in);
			e.setFaculty(new Faculty(q.nextLine(), q.nextLine()));
			e.display();
			break;
			}
		
		case 4:{
			
			System.out.println("ENTER EVENT DETAILS");
			Scanner q = new Scanner(System.in);
			e.setDetails(q.nextLine());
			e.display();
			break;
			}
			
			
		}
		}
	
	public void editGrades(StudentList l, String r) {
		
		
		Student s = l.findStudent(r);
		
		s.displayClassNames();
		System.out.println("ENTER CLASS TO CHANGE GRADES: ");
		Scanner p = new Scanner(System.in);
		String name = p.nextLine();
		
		Grades g = s.findClass(name).g;
		
		g.display();
		
		System.out.println("1: EDIT INTERNALS");
		System.out.println("2: EDIT PERIODICAL 1");
		System.out.println("3: EDIT PERIODICAL 2");
		System.out.println("4: EDIT END SEMESTER");
	
			
		int n = p.nextInt();
		
		
		
		switch(n) {
		
		case 1: {
			
			System.out.println("ENTER NEW INTERNALS");
			Scanner q = new Scanner(System.in);
			g.setInternal(q.nextDouble());
			g.display();
			break;
			
		}
		
		
		case 2: {
			
			System.out.println("ENTER NEW PERIODICAL 1 SCORE");
			Scanner q = new Scanner(System.in);
			g.setPeriodical1(q.nextDouble());
			g.display();
			break;
			
		}
		
		
		case 3: {
			
			System.out.println("ENTER NEW PERIODICAL 2 SCORE");
			Scanner q = new Scanner(System.in);
			g.setPeriodical2(q.nextDouble());
			g.display();
			break;
			
		}
		
		
		case 4: {
			
			System.out.println("ENTER NEW END SEM SCORE");
			Scanner q = new Scanner(System.in);
			g.setPeriodical1(q.nextDouble());
			g.display();
			break;
			
		}
		
		}
			
	}
	
	
	public void editAttendance(StudentList l, String r) {
		
		Student s = l.findStudent(r);

		s.displayClassNames();
		System.out.println("ENTER CLASS TO CHANGE ATTENDANCE:");
		Scanner p = new Scanner(System.in);
		String name = p.nextLine();
		
		Attendance a = s.findClass(name).a;
		
		a.display();
		
		System.out.println("1: EDIT DAYS PRESENT");
		System.out.println("2: EDIT DAYS ABSENT");
		
		
		int n = p.nextInt();
		
		switch(n) {
		
		case 1:{
			
			System.out.println("ENTER DAYS PRESENT");
			Scanner q = new Scanner(System.in);
			a.setPresent(q.nextInt());
			a.calcAttendance();
			a.display();
			break;
			
		}
		
		case 2:{
			
			
			System.out.println("ENTER DAYS ABSENT");
			Scanner q = new Scanner(System.in);
			a.setAbsent(q.nextInt());
			a.calcAttendance();
			a.display();
			break;
		}
		}
		}
	
	public void writeData(StudentList sl) {
		
		
		ObjectOutputStream os = null;
		
		try {
			
			os = new ObjectOutputStream(new BufferedOutputStream (new FileOutputStream("finaldata")));
			
			
			os.writeObject(sl);
			
		}
		
		catch(Exception e) {}
		
		finally{
			
			try {
			
			os.close();
			
			}
			
			catch(Exception e) {}
		}
		
		
		
		
	}
	
	}


		
		
	
	
	
	
	
	
	

