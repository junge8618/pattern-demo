/**
 * 
 */
package com.junge.demo.pattern.create.builder.es;

/**
 * @author liuxj
 *
 */
public class EsAction {
	private final String name;

	protected EsAction(String name) {
		this.name = name;
	}

	/**
	 * The name of the action. Must be unique across actions.
	 */
	public String name() {
		return this.name;
	}
	
	public void execute(EsRequest request) {
		System.out.println("execute name : " + this.name() + ", execute request : " + request);
	}
}
