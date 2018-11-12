import java.util.*;
import java.io.*;
public class ListOfClasses {
	
	ArrayList <Class> classList;
	int numberOfClasses;
	StudentList sl;
	private static final String filename = "Class.txt";
	private static final String filename2 = "Grades.txt";
	private static final String filename3 = "Attendance.txt";
	ArrayList <Class> a;
	
	ListOfClasses(int n, StudentList sl){
	
	classList = new ArrayList <Class>();
	numberOfClasses = n;
	this.sl = sl;

	
	}
	public void setClassList() {
		
		BufferedReader br = null;
		FileReader fr = null;
		
		try {
			
			fr = new FileReader(filename);
			br = new BufferedReader(fr);
			
		}
		
		catch(IOException e) {
			
			e.printStackTrace();
			
		}
		
		try {
		
		String line;
		
		
				
			while((line = br.readLine())!=null) {
				
				String[] classes = line.split(":");
				Student s =sl.findStudent(classes[0]);
				a = new ArrayList <Class>();
				
				for(int i=1; i<classes.length; i++) {
				
				String[] words = classes[i].split(",");
				Faculty f = new Faculty(words[2], words[3]);
				Class c = new Class(words[0], words[1], f);
				a.add(c);
				
				//classList.add(c);
				
				}
				
				s.setClasses(a);
			}}
		
		catch(IOException e) {}
		catch(NullPointerException r) {}
		
		
	
		
		finally {

			try { 

				if (br != null)
					br.close();

				if (fr != null)
					fr.close();

			} catch (IOException ex) {}
		}}
	
	public void readGrades() {
		
		BufferedReader br = null;
		FileReader fr = null;
		
		try {
			
			fr = new FileReader(filename2);
			br = new BufferedReader(fr);
			
		}
		
		catch(IOException e) {}
		
		try {

		String line;
		
		while((line= br.readLine())!=null){
			
			String[] classes = line.split(":");
			Student s =sl.findStudent(classes[0]);
			
			for(int i=1; i<classes.length; i++) {
			
			String words[] = classes[i].split(",");
			
			Class c = s.findClass(words[0]);
			
			
			
			Grades g = new Grades();
			c.setGrades(g);
				
				c.g.setInternal(Double.parseDouble(words[1]));
				c.g.setPeriodical1(Double.parseDouble(words[2]));
				c.g.setPeriodical2(Double.parseDouble(words[3]));
				c.g.setEndSem(Double.parseDouble(words[4]));
				c.g.calculateTotal();
				
					
				}}}
		
catch(IOException e) {
	
	e.printStackTrace();
	
}
catch(NullPointerException r) {
	
	r.printStackTrace();
	
}
		
		finally {

			try {

				if (br != null)
					br.close();

				if (fr != null)
					fr.close();

			} catch (IOException ex) {}
		
		
		
	}
	
}
	public void readAttendance() {
		
		BufferedReader br = null;
		FileReader fr = null;
		
		try {
			
			fr = new FileReader(filename3);
			br = new BufferedReader(fr);
			
		}
		
		catch(IOException e) {}
		
		try {

		String line;
		
		while((line= br.readLine())!=null){
		
		String[] classes = line.split(":");
		Student s =sl.findStudent(classes[0]);
		
		for(int i=1; i<classes.length; i++) {
			
		Attendance a = new Attendance();
		
		
		String words[] = classes[i].split(",");
		
		Class c = s.findClass(words[0]);
		c.setAttendance(a);
		
			
			c.a.setAbsent(Integer.parseInt(words[1]));
			c.a.setPresent(Integer.parseInt(words[2]));
			c.a.calcAttendance();
				}
		
		
	}
}
		
		
catch(IOException e) {}
catch(NullPointerException r) {}
		
		finally {

			try {

				if (br != null)
					br.close();

				if (fr != null)
					fr.close();

			} catch (IOException ex) {}
		
		
		
	}
	
	}
	
	


	
	
	
	
	
	
	
	
	
	
	
	
	
	
}