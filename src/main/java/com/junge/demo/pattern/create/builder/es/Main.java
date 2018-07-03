/**
 * 
 */
package com.junge.demo.pattern.create.builder.es;

/**
 * @author liuxj
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		EsClient client = new EsClient();
		UpdateRequestBuilder builder = client.prepareSearch("indice")
				.setId("myid")
				.setParent("myroute")
				.setType("mytype")
				.setRouting("myrouting");
		builder.executeUpdate();

	}

}
