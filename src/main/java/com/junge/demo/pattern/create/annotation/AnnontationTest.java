package com.junge.demo.pattern.create.annotation;

public class AnnontationTest {

	public static void main(String[] args) {
		CustormDescriptions custormDescriptions = new Student().getClass().getAnnotation(CustormDescriptions.class);

		for (CustormDescription h : custormDescriptions.value()) {

			System.out.println("description:" + h.description());

		}

	}

}
