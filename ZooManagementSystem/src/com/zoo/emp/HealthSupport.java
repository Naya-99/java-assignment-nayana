package com.zoo.emp;
import com.zoo.emp.Employee;
public class HealthSupport extends Employee{

	public static void emp() {
	Employee hs=new HealthSupport();
	hs.setName("Nayana");
	hs.setAge(23);
	hs.setContact(8352826747L);
	hs.setAddress("bangalore");
	hs.setDesignation("engineer");

	System.out.println(hs.getName());
	System.out.println(hs.getAge());
	System.out.println(hs.getContact());
	System.out.println(hs.getAddress());
	System.out.println(hs.getDesignation());
	}

	public void work()
	{
		System.out.println("engineer");
	}

}
