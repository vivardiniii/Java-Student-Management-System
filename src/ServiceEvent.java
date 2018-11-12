
public class ServiceEvent extends Event {
	
	String duty;
	
	
	ServiceEvent() {}
	
	
	
	ServiceEvent(String duty){
		
		this.duty = duty;
		
		
	}
	
	
	
	public void setDuty(String duty) {
		
		this.duty = duty;
	}
	
	
	public void display() {
		
		super.display();
		System.out.println("DUTY: " + duty);
		System.out.println("----------------------------------------------");
	}

}
