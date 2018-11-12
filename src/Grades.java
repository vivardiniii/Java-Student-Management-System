import java.io.Serializable;

public class Grades implements Serializable {
	
	double internal;
	double periodical1;
	double periodical2;
	double endsem;
	double total;
	
	Grades() {}
	
	Grades(double i, double p1, double p2, double e){
		
		internal = i;
		periodical1 = p1;
		periodical2 = p2;
		endsem = e;
	}
	
	
	public void setInternal(double i) {
		
		internal = i;
		
	}
	
	public void setPeriodical1(double p1) {
		
		periodical1 = p1;
	}
	
	public void setPeriodical2(double p2) {
		
		periodical2 = p2;
	}
	
	public void setEndSem(double e) {
		
		endsem = e;
	}
	
	public void calculateTotal() {
		
		total = (.5*endsem + .15*periodical1 + .15*periodical2 + .2*internal);
	}
	
	public void display() {
		
		
		System.out.println("GRADES:");
		System.out.println("INTERNALS: " + internal);
		System.out.println("PERIODICAL 1: " + periodical1);
		System.out.println("PERIODICAL 2: " + periodical2);
		System.out.println("END SEM: " + endsem);
		System.out.println("TOTAL: " + total);
	}
	

}
