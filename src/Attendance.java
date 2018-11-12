import java.io.Serializable;

public class Attendance implements Serializable {
	
	double present;
	double absent;
	
	double attendance;
	
	public void setPresent(int present) {
		
		this.present = present;
	}
	
	public void setAbsent(int absent) {
		
		this.absent = absent;
	}
	
	public void calcAttendance() {
		
		attendance = (double) (present/(present+absent))*100;
	}
	
	public void display() {
		
		System.out.println("ATTENDANCE: ");
		System.out.println("PRESENT: " + present);
		System.out.println("ABSENT: " + absent);
		System.out.println("TOTAL: " + attendance + "%");
		System.out.println("--------------------------------");
	}


}
