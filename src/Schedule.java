import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
public class Schedule {
	
	int arrear;
	private static final String filename = "Schedule.txt";
	ArrayList <ArrayList> schedule;
	ListOfClasses l;
	
	
	Schedule() {}

	Schedule(int arrear, ListOfClasses l){
		
		
		this.arrear = arrear;
		schedule = new ArrayList <ArrayList>();
		this.l = l;
		
		
	}
	
	
	public void setArrears(int arrear) {
		
		this.arrear = arrear;
	}
	
	
	public void setSchedule() {
		

		BufferedReader br = null;
		FileReader fr = null;
		
		try {
			
			fr = new FileReader(filename);
			br = new BufferedReader(fr);
			
		}
		
		catch(IOException e) {}
		
		try {
			
			for(int i=0; i<6; i++) {
				
				ArrayList <Class> day = new ArrayList <Class>();
				
				String current = br.readLine();
				
				for(int j =0; j< l.numberOfClasses-1; j++) {
					
					if(current.equals(l.classList.get(j).name))
						
						day.add(l.classList.get(j));
					
				}
				
				schedule.add(day);
					
					
				}
			
		}
			
			catch(IOException e) {}
		
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

		
	
		
	
		
		