public class Address{
	private String street;
	private String city;
	private String state;

	public Address(){
		street="";
		city="";
		state="";
	}

	public Address(String s, String c, String st){
		street=s;
		city=c;
		state=st;
	}

	public String getFullAddress(){return street + ", " + city + ", " + state;}
}