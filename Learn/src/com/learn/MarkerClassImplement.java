package com.learn;

//marker interface is empty interface
//it deliver the run-time type information about object .
//jvm and compiler have addition infromaiton about an object
public class MarkerClassImplement implements Cloneable {

	int markId;
	String markerName;
	
	public MarkerClassImplement(int markId, String markerName) {
		super();
		this.markId = markId;
		this.markerName = markerName;
	}

	public int getMarkId() {
		return markId;
	}

	public void setMarkId(int markId) {
		this.markId = markId;
	}

	public String getMarkerName() {
		return markerName;
	}

	public void setMarkerName(String markerName) {
		this.markerName = markerName;
	}
	
	
	public void display() {
		System.out.println("mark id :"+markId);
		System.out.println("mark name: "+markerName);
	}
	
	public static void main(String[] args) throws CloneNotSupportedException {
		MarkerClassImplement obj=new MarkerClassImplement(101, "Interface");
		obj.display();
		
		MarkerClassImplement cloneObj= (MarkerClassImplement) obj.clone();
		cloneObj.display();
	}
	
	
}
