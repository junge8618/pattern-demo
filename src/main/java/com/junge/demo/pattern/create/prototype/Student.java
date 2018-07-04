/**
 * 
 */
package com.junge.demo.pattern.create.prototype;

import java.io.Serializable;

/**
 * @author "liuxj"
 *
 */
public class Student implements Cloneable, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4903669706099624248L;

	private Integer id;
	
	private String name;
	
	private Book book;

	@Override
	protected Object clone() throws CloneNotSupportedException {
		Student ret = (Student)super.clone();
		if (null != this.book) {
			ret.book = (Book)this.book.clone();
		}
		return ret;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", book=" + book + "]";
	}

}
