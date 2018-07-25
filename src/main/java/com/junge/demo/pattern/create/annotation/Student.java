/**
 * 
 */
package com.junge.demo.pattern.create.annotation;

/**
 * @author "liuxj"
 *
 */
@CustormDescription(description="学生")
public class Student extends Person {
	private String StudentId;

    public String getStudentId() {
        return StudentId;
    }

    public void setStudentId(String studentId) {
        StudentId = studentId;
    }
}
