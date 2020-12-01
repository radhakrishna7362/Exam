package entity;

public class person{
	private int pincode;
	private String name,gender,location;
	
	private person() {
		this.name="xxx";
		this.gender="male";
		this.location="xxx";
		this.pincode=0;
	}
	
	public person(String name,String gender,String location,int pincode) {
		this();
		this.setName(name);
		this.setGender(gender);
		this.setLocation(location);
		this.setPincode(pincode);
	}

	public boolean setName(String name) {
		if(!name.isEmpty() && name!=null) {
			this.name=name;
			return true;
		}
		return false;
	}
	
	public boolean setGender(String gender) {
		if(!gender.isEmpty() && gender!=null) {
			this.gender=gender;
			return true;
		}
		return false;
	}
	
	public boolean setLocation(String location) {
		if(!location.isEmpty() && location!=null) {
			this.location=location;
			return true;
		}
		return false;
	}
	
	public boolean setPincode(int pincode) {
		if(pincode>0) {
			this.pincode=pincode;
			return true;
		}
		return false;
	}

	public String getPincode() {
		return Integer.toString(this.pincode);
	}
	
	public String getName() {
		return this.name.toUpperCase();
	}
	
	public String getGender() {
		return this.gender.toUpperCase();
	}
	
	public String getLocation() {
		return this.location.toUpperCase();
	}

}
