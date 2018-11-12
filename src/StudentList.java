import java.io.*;
import java.util.*;
public class StudentList {
	
	int n;
	
	ArrayList <Student>  a = new ArrayList <Student>();
	
	StudentList(int n){
		
		this.n = n;
	}
	
	
	
	public void setStudentList() {
		
		
		
		BufferedReader br = null;
		FileReader fr = null;
		
		try {
			
			
			fr = new FileReader("Student.txt");
		
			br = new BufferedReader(fr);
			
			
			String line;
			
	
			while((line = br.readLine())!=null) {
				
				
				
				String words[] = line.split(",");
				Student s = new Student(words[1], Integer.parseInt(words[2]), words[3]);
				s.setName(words [0]);
				s.setAddress(words[4],words[5],words[6],words[7],Integer.parseInt(words[8]));
				s.setBirthday(Integer.parseInt(words[9]),Integer.parseInt(words[10]),Integer.parseInt(words[11]));
				a.add(s);
		
	
			}
			
			

}
catch(IOException e) {
	
	
	e.printStackTrace();
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
	
	public void displayList() {
		
		for(Student s: a) {
			
			
			
			
			s.displayStudentDetails();
		}
	}
	
	public void displayRollNumbers() {
		
		for(Student s: a) {
			
			System.out.println(s.roll);
			
		}
		
		
	}
	
	
	
	public Student findStudent(String r) {
		
		Student t = new Student();
		
		for(Student s: a) {
			
			
			
			if(s.roll.equals(r)) {
				
				t =s;
		
			
		}
		}

		return t;
	}
	
}
		
