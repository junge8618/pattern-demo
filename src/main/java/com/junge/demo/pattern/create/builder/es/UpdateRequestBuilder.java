/**
 * 
 */
package com.junge.demo.pattern.create.builder.es;

/**
 * @author liuxj
 *
 */
public class UpdateRequestBuilder extends EsCommonBuilder {

	public UpdateRequestBuilder(EsAction action, EsRequest request, EsThreadPool threadPool, EsClient client) {
		super(action, request, threadPool, client);
	}
	
	public UpdateRequestBuilder(EsClient client) {
		super(new EsAction("default"), new EsRequest(), new EsThreadPool(), client);
	}

	/**
	 * Sets the type of the indexed document.
	 */
	public UpdateRequestBuilder setType(String type) {
		request.type(type);
		return this;
	}

	/**
	 * Sets the id of the indexed document.
	 */
	public UpdateRequestBuilder setId(String id) {
		request.id(id);
		return this;
	}

	/**
	 * Controls the shard routing of the request. Using this value to hash the
	 * shard and not the id.
	 */
	public UpdateRequestBuilder setRouting(String routing) {
		request.routing(routing);
		return this;
	}

	public UpdateRequestBuilder setParent(String parent) {
		request.parent(parent);
		return this;
	}
	
	public UpdateRequestBuilder setIndices(String... indices) {
		request.indices(indices);
		return this;
	}
	
	public void executeUpdate() {
		action.execute(request);
	}
}
