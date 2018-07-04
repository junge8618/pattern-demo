/**
 * 
 */
package com.junge.demo.pattern.create.prototype;

import java.io.Serializable;

/**
 * @author "liuxj"
 *
 */
public class Book implements Cloneable, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8204645069699126866L;
	
	private Integer no;
	private String name;

	public Integer getNo() {
		return no;
	}

	public void setNo(Integer no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public String toString() {
		return "Book [no=" + no + ", name=" + name + "]";
	}

}
