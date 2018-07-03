package com.junge.demo.pattern.create.builder.es;

public class EsClient {

	public UpdateRequestBuilder prepareSearch(String... indices) {
		return new UpdateRequestBuilder(this).setIndices(indices);
	}
}
