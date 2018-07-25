package com.junge.demo.pattern.create.annotation;

@CustormDescription(description = "基类")
@CustormDescription(description = "人")
public class Person {
	private String Name;

	private int Age;

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

}
