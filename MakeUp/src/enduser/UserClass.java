package enduser;

import collectors.Patients;
import entity.patient;
public class UserClass {
	public static void main(String args[]) {
		
		Patients p=new Patients();
		patient p1=new patient("RK","male","kavali",524201,"Mohith","male","tirupati",517503);
		patient p2=new patient("PK","male","mumbai",500004,"Manoj","male","Vizg",504250);
		patient p3=new patient("Pavan","male","chennai",500404,"Akhil","male","Vijayawada",523014);
		patient p4=new patient("Sudheer","male","kavali",524201,"Akhil","male","Vijayawada",523014);
		p.addPatient(p1);
		p.addPatient(p2);
		p.addPatient(p3);
		p.addPatient(p4);
		System.out.println("****************************************");
		System.out.println(p);
		System.out.println("****************************************");
		p.sortPatients();
		System.out.println("*****Sorted by Patient Pincode and Doctor Name*****");
		System.out.println(p);
		System.out.println("****************************************");
	}
}