/**
 * 
 */
package com.junge.demo.pattern.create.prototype;

/**
 * @author "liuxj"
 *
 */
public class Main {

	public static void main(String[] args) throws Exception {
		Student s = new Student();
		s.setId(1);
		s.setName("dd");
		
		Student s1 = (Student) s.clone();
		System.out.println(s == s1);
		System.out.println(s);
		System.out.println(s1);
		
		Book book = new Book();
		book.setNo(3222);
		book.setName("历史");
		s.setBook(book);
		
		Student s2 = (Student) s.clone();
		System.out.println(s == s2);
		System.out.println(s);
		System.out.println(s2);
		
		book.setName("修改后名称");
		System.out.println(s == s2);
		System.out.println(s);
		System.out.println(s2);
		
		Student s3 = (Student) DeepCloneUtil.copy(s);
		System.out.println(s == s3);
		System.out.println(s);
		System.out.println(s3);
	}
}
