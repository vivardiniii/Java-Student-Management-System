import java.io.*;
import java.util.*;
public class EventList {

	
	ArrayList <Event> a;
	int n;
	StudentList sl;
	
	EventList(int n,StudentList sl){
		
		a = new ArrayList <Event>();
		this.n = n;
		this.sl=sl;
	}
		
	
	public void setEventList() {
		
		BufferedReader br = null;
		FileReader fr = null;
		
		try {
			
			
			fr = new FileReader("Events.txt");
			br = new BufferedReader(fr);
			
		
			String line;
			
			
			while((line = br.readLine())!=null) {
				
				String[] events = line.split(":");
				Student s =sl.findStudent(events[0]);
				
			    a = new ArrayList <Event>();
				
				for(int i=1; i<events.length; i++) {
					
				String words[] = events[i].split(",");
				
				switch(words[0]) {
				
				case "Cultural": {
					
					Event e = new CulturalEvent(words[2],words[3],words[4]);
					e.setName(words[1]);
					e.setDetails(words[5]);
					a.add(e);
					e.setFaculty(new Faculty(words[6], words[7]));
					
					String[] date=words[8].split(";");
					
					e.setDate(Integer.parseInt(date[0]), Integer.parseInt(date[1]), Integer.parseInt(date[2]));
					break;
					
				}
				
				case "Sport":{
					
					Event e = new SportEvent(Integer.parseInt(words[2]),words[3],words[4], words[5]);
					e.setName(words[1]);
					e.setDetails(words[6]);
					a.add(e);
					e.setFaculty(new Faculty(words[7], words[8]));
					
					String[] date=words[9].split(";");
					
					e.setDate(Integer.parseInt(date[0]), Integer.parseInt(date[1]), Integer.parseInt(date[2]));
					
					
					break;
				}
				
				
				case "Service": {
					
					
					Event e = new ServiceEvent(words[2]);
					e.setName(words[1]);
					e.setDetails(words[3]);
					a.add(e);
					e.setFaculty(new Faculty(words[4], words[5]));
					
					String[] date=words[6].split(";");
					
					e.setDate(Integer.parseInt(date[0]), Integer.parseInt(date[1]), Integer.parseInt(date[2]));
					
					break;
				}
				
				
				case "STEM" :{
					
					Event e = new STEMEvent(words[2], words[3], words[4]);
					e.setName(words[1]);
					e.setDetails(words[5]);
					a.add(e);
					e.setFaculty(new Faculty(words[6], words[7]));
					
					String[] date=words[8].split(";");
					
					e.setDate(Integer.parseInt(date[0]), Integer.parseInt(date[1]), Integer.parseInt(date[2]));
					
					
					break;
					
				}
				
				}
				
				s.setEvents(a);
				
				}
			}
			
			
			
			
			
		}
		
catch(IOException e) {
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
	

	
	
		
		
	}
	

			
			
			
	
