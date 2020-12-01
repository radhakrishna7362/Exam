package collectors;

import java.util.ArrayList;
import java.util.Collections;

import entity.patient;

public class Patients {
private ArrayList<patient> pts;
	
	public Patients() {
		pts=new ArrayList<patient>();
	}
	
	public boolean addPatient(patient s) {
		if(s!=null) {
			pts.add(s);
			return true;
		}
		return false;
	}
	
	public String toString() {
		String out="";
		for(patient s:pts) {
			out+=s.toString();
		}
		return out;
	}
	
	public void sortPatients() {
	   	Collections.sort(pts);
	}
}
