package com.zoo.emp;
import com.zoo.emp.Employee;

public class SupportEmployee extends Employee {


public static void emp() {
	
SupportEmployee ep=new SupportEmployee();
ep.setName("abc");
ep.setAge(23);
ep.setContact(9863342756L);
ep.setAddress("bangalore");
ep.setDesignation("software engineer");

System.out.println(ep.getName());
System.out.println(ep.getAge());
System.out.println(ep.getContact());
System.out.println(ep.getAddress());
System.out.println(ep.getDesignation());
}

public void work()
{
	System.out.println("software engineer");
}
}

