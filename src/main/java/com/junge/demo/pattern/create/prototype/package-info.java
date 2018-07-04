/**
 * 原型模式
 * 原型模式属于对象的创建模式。通过给出一个原型对象来指明所有创建的对象的类型，然后用复制这个原型对象的办法创建出更多同类型的对象。这就是选型模式的用意。
 * 
 * 1.java中的对象如果要支持克隆，类需要实现java.lang.Cloneable接口，并重写Object.clone()方法
 * 如果没有实现Cloneable接口，会抛CloneNotSupportedException异常。
 * 
 * 如果对象有引用其它对象，需要被引用的对象也实现Cloneable接口，且重写clone()方法，在引用类中的clone()中，需要显示调用被引用对象的clone()方法
 * @Override
	protected Object clone() throws CloneNotSupportedException {
		Student ret = (Student)super.clone();
		if (null != this.book) {
			ret.book = (Book)this.book.clone();
		}
		return ret;
	}
	
	2.使用二进制流实现深度克隆，需要实现Serializable接口，包括引用对象也需要实现Serializable接口
	
 * @author "liuxj"
 *
 */
package com.junge.demo.pattern.create.prototype;