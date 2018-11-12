import java.util.*;
public class SportEvent extends Event {
	
	int rank;
	String team;
	String sport;
	String award;
	
	
	SportEvent(int r, String t, String s, String a){
		
		
		rank = r;
		team = t;
		award = a;
		sport = s;
		
		
	}
	
	
	
	public void setRank(int rank) {
		
		this.rank = rank;

	}
	
	public void setTeam(String team) {
		
		this.team = team;
	}
	
	public void setSport(String sport) {
		
		this.sport = sport;
	}
	
	public void setAward(String award) {
		
		this.award = award;
	}
	
	public void display() {
		
		super.display();
		System.out.println("RANK: "+ rank);
		System.out.println("SPORT: "+ sport);
		System.out.println("TEAM: "+ team);
		System.out.println("----------------------------------------------");
	}

}
