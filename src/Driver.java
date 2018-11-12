import java.util.*;
public class Driver {
	
	public static void main(String args[]) {
		
		boolean again = true;
		
		StudentList sl = new StudentList(3);
		
		sl.setStudentList();
		EventList el=new EventList(4,sl);
		
		ListOfClasses ls = new ListOfClasses(4, sl);
		
		el.setEventList();
		ls.setClassList();
		ls.readAttendance();
		ls.readGrades();
		
		while(again) {
		
		System.out.println("1: I'M A STUDENT");
		System.out.println("2: I'M A PART OF THE FACULTY");
		System.out.println("3: EXIT");
		
		Scanner p = new Scanner(System.in);
		int n = p.nextInt();
		System.out.println("----------------------------------------------");
		
	
		switch(n) {
		
		case 1: {
			boolean again1=true;

			while(again1) {
				
				
				
			Student s = new Student();
			
			
			sl.displayRollNumbers();
			System.out.println("ENTER ROLL NUMBER: ");
			Scanner u = new Scanner(System.in);
			String roll = u.nextLine();
			s = sl.findStudent(roll);

			System.out.println("1: DISPLAY STUDENT DETAILS");
			System.out.println("2: DISPLAY CLASSES");
			System.out.println("3: DISPLAY EVENTS");
			System.out.println("4: EXIT");
			
			
			Scanner q = new Scanner(System.in);
			
			int w = q.nextInt();
			System.out.println("----------------------------------------------");

			
			
			
		
			switch(w) {
			
			
			case 1:{
				
				
				s.displayStudentDetails();
				break;
			}
			
			case 2: {
				
				s.displayClasses();
				break;
				
			}
			
			
			case 3: {
				
				s.displayEvents();
				break;
			}
			
			case 4:{
				
				again1=false;
				break;
					
			}
			
			}
					
			}
			
			break;
			
				
			
		}
		
		
		case 2: {
			
			boolean again2=true;
			while(again2) {
			
			System.out.println("1: DISPLAY STUDENT DETAILS");
			System.out.println("2: EDIT STUDENT DETAILS");
			System.out.println("3: EXIT");
			
		
			Scanner t = new Scanner(System.in);
			int z = t.nextInt();
			System.out.println("----------------------------------------------");
			
			Faculty temp = new Faculty();
			
			
			switch(z) {
			
			
			
			case 1:{
				
				boolean again3=true;
				while(again3) {
			
				
				sl.displayRollNumbers();
				System.out.println("ENTER ROLL NUMBER OF STUDENT: ");
				Scanner x = new Scanner(System.in);
				String roll = x.nextLine();
				Student s = sl.findStudent(roll);
				
				System.out.println("1: DISPLAY STUDENT DETAILS");
				System.out.println("2: DISPLAY CLASSES");
				System.out.println("3: DISPLAY EVENTS");
				System.out.println("4: EXIT");
				
				
				Scanner q = new Scanner(System.in);
				int w = q.nextInt();
				System.out.println("----------------------------------------------");

				
				
				switch(w) {
				
				
				case 1:{
					
					
					s.displayStudentDetails();
					break;
				}
				
				case 2: {
					
					s.displayClasses();
					break;
					
				}
				
				
				case 3: {
					
					s.displayEvents();
					break;
				}
				
				case 4:{
					
					again3 = false;
					break;
				}
				
				}
			
				
				}
				break;
			}
			
			case 2: {
				boolean again4;
				again4=true;
				while(again4) {
					
				sl.displayRollNumbers();	
				System.out.println("ENTER ROLL NUMBER: ");
				Scanner u = new Scanner(System.in);
				String roll = u.nextLine();
				Student s = sl.findStudent(roll);
			
				
			
				
				System.out.println("1: EDIT STUDENT DETAILS");
				System.out.println("2: EDIT CLASSES");
				System.out.println("3: EDIT GRADES");
				System.out.println("4: EDIT ATTENDANCE");
				System.out.println("5: EDIT EVENTS");
				System.out.println("6: EXIT");
				
				
				Scanner q = new Scanner(System.in);
				int w = q.nextInt();
				System.out.println("----------------------------------------------");
				
				
				
				switch(w) {
				
				
				case 1:{
					
					temp.editStudentDetails(sl, s.roll);
					break;
				}
				
				
				case 2:{
					
					temp.editStudentClass(sl, s.roll);
					break;
				}
				
				case 3:{
					
					temp.editGrades(sl, s.roll);
					break;
				}
				case 4:{
					
					temp.editAttendance(sl, s.roll);
					break;
				}
				case 5:{
					
					temp.editEventList(sl, s.roll);
					break;
				}
				
				case 6:{
					
					again4 = false;
					break;
				}
				
		
				}
				
			}
			break;
			}
			
			case 3:{
				
				again2 = false;
				break;
			}
			
			
			
			}
		
			}
			break;
			}
		
		case 3:{
			
			again = false;
			break;
		}
		
		}
		
		
		
		
		
		}
		
		
		Faculty f = new Faculty();
		f.writeData(sl);
	}
	}


