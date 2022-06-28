package com.zoo.animal;

public class Animal {
private String name;
private int age;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}

public static void animal()
{
	Animal a=new Animal();
	a.setAge(15);
	a.setName("chintu");
		System.out.println(a.getAge());	
		System.out.println(a.getName());	
}

public void sleep()
{
	System.out.println("chintu Sleeps after eating..");
}
public void woke()
{
	System.out.println("chintu woke-up after sleeping..");
}

}
