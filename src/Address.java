
public class Address {
	
	String street;
	String city;
	String state;
	String country;
	int zip;
	
	Address(){}
	
	Address(String street, String city, String state, String country, int zip){
		
		this.street = street;
		this.city = city;
		this.state = state;
		this.country = country;
		this.zip = zip;
	}
	
	public void setAddress(String street, String city, String state, String country, int zip) {
		
		this.street = street;
		this.city = city;
		this.state = state;
		this.country = country;
		this.zip = zip;
		
		
		
	}
	
	public void display() {
		
		System.out.println("ADDRESS:");
		System.out.println(street);
		System.out.println(city + "," + state + "," + country + " " + zip);
		
	}

}
