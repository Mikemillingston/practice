package com.oops.testing;

public class CloneObjects implements Cloneable {
	
	int rollNo;
	String name;
	
	public CloneObjects(int rollNo, String name) {
		this.name =name;
		this.rollNo=rollNo;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

