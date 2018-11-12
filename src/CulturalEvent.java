public class CulturalEvent extends Event{
	
	String type;
	String award;
	String team;
	
	
	CulturalEvent(String t, String team, String a){
		
		type = t;
		award = a;
		this.team = team;
	}
	
	public void setType(String type) {
		
		this.type = type;
		
	}
	
	public void setAward(String award) {
		
		this.award = award;
		
	}
	
	public void setTeam(String team) {
		
		this.team = team;
	}
	
	public void display() {
		
		super.display();
		System.out.println("TYPE OF EVENT: "+ type);
		System.out.println("TEAM: "+ team);
		System.out.println("AWARD: "+ award);
		System.out.println("----------------------------------------------");
		
	}
	
	

}
