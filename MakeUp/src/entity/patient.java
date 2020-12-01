package entity;

public class patient extends person implements Comparable<patient> {

	private Doctor d;
	public patient(String name, String gender, String location, int pincode,String dname,String dgender, String dlocation, int dpincode) {
		super(name, gender, location, pincode);
		d=new Doctor(dname, dgender, dlocation, dpincode);
		// TODO Auto-generated constructor stub
	}
	
	public int compareTo(patient p) {
		int c=p.getPincode().compareTo(super.getPincode());
		if(c==0) {
			c=this.d.compareTo(p.d);
		}
		return c;
	}
	
	public String toString() {
		String out ="***PatientDetails***";
		out+=String.format("%nName = %s ", super.getName());
		out+=String.format("%nGender: %s ", super.getGender());
		out+=String.format("%nLocation: %s ", super.getLocation());
		out+=String.format("%nPincode: %s %n", super.getPincode());
		out+=String.format("*************%n");
		out+=d.toString();
		return out;
	}
}
