package entity;

public class Doctor extends person implements Comparable<Doctor> {

	public Doctor(String name, String gender, String location, int pincode) {
		super(name, gender, location, pincode);
		// TODO Auto-generated constructor stub
	}

	public int compareTo(Doctor d) {
		int c=super.getName().compareTo(d.getName());
		return c;
	}
	
	public String toString() {
		String out ="***DoctorDetails***";
		out+=String.format("%nName = %s ", super.getName());
		out+=String.format("%nGender: %s ", super.getGender());
		out+=String.format("%nLocation: %s ", super.getLocation());
		out+=String.format("%nPincode: %s %n", super.getPincode());
		out+=String.format("*************%n");
		return out;
	}
}
