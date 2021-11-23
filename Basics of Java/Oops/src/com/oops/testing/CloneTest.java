package com.oops.testing;

public class CloneTest {
	public static void main(String[] args) throws CloneNotSupportedException {
		CloneObjects obj1 = new CloneObjects(200, "Nethaji");
		CloneObjects obj2 = (CloneObjects) obj1.clone();
		System.out.println(obj1.name + " " + obj1.rollNo);
		System.out.println(obj2.name + " " + obj2.rollNo);

	}
}