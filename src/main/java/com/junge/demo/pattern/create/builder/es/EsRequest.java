/**
 * 
 */
package com.junge.demo.pattern.create.builder.es;

import java.util.Arrays;

/**
 * @author liuxj
 *
 */
public class EsRequest {
	private String type;
	private String id;
	private String routing;
	private String parent;
	
	private String[] indices;

	public String type() {
		return type;
	}

	public void type(String type) {
		this.type = type;
	}

	public String id() {
		return id;
	}

	public void id(String id) {
		this.id = id;
	}

	public String routing() {
		return routing;
	}

	public void routing(String routing) {
		this.routing = routing;
	}

	public String parent() {
		return parent;
	}

	public void parent(String parent) {
		this.parent = parent;
	}
	
	public String[] indices() {
		return this.indices;
	}

	public void indices(String... indices) {
		this.indices = indices;
	}

	@Override
	public String toString() {
		return "EsRequest [type=" + type + ", id=" + id + ", routing=" + routing + ", parent=" + parent + ", indices="
				+ Arrays.toString(indices) + "]";
	}

}
