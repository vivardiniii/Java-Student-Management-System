import java.util.*;
public abstract class Person {
	
	String name;
	Address a;
	Date birthday;
	
	
	
	
	public void setName(String name) {
		
		this.name = name;
	}
	
	public void setAddress(String street, String city, String state, String country, int zip) {
		
		a = new Address(street, city, state, country, zip);
	}
	
	public void setBirthday(int month, int date,int year) {
		
		birthday = new Date(year, month, date);
	}
	
	public void displayPersonalDetails() {
		
		System.out.println("NAME: " + name);
		a.display();
		System.out.println("BIRTHDAY: " + birthday);
	}

}
