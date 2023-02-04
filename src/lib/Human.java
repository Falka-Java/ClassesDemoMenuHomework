package lib;

public class Human {
	private String name;
	private String birthDate;
	private String phone;
	private String country;
	private String city;
	private String addr;
	
	public String getName() {
		return name;
	}
	
	public Human(String name, String birthDate, String phone, String country, String city, String addr) {
		this.name = name;
		this.birthDate = birthDate;
		this.phone = phone;
		this.country = country;
		this.city = city;
		this.addr = addr;
	}
	
	@Override
	public String toString() {
		return String.format("%s - %s :: %s -> %s / %s / %s", name, birthDate, phone, country, city, addr);
	}
}
