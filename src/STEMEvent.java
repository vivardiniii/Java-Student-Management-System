
public class STEMEvent extends Event {
	
	String department;
	String topic;
	String type;
	
	
	STEMEvent(String d, String t, String type){
		
		department = d;
		topic = t;
		this.type = type;
	}
	
	
	public void setDepartment(String department) {
		
		this.department = department;
	}
	
	
	public void setTopic(String topic) {
		
		this.topic = topic;
		
	}
	
	public void display() {
		
		super.display();
		System.out.println("DEPARTMENT: "+ department);
		System.out.println("TYPE: " + type);
		System.out.println("TOPIC "+ topic);
		System.out.println("----------------------------------------------");
		
	}
	
	

}
