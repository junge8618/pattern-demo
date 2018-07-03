/**
 * 
 */
package com.junge.demo.pattern.create.builder.es;

/**
 * @author liuxj
 *
 */
public class EsCommonBuilder {

	protected EsAction action;
	protected EsRequest request;
	protected EsThreadPool threadPool;
	protected EsClient client;

	public EsCommonBuilder(EsAction action, EsRequest request, EsThreadPool threadPool, EsClient client) {
		super();
		this.action = action;
		this.request = request;
		this.threadPool = threadPool;
		this.client = client;
	}

	public EsAction getAction() {
		return action;
	}

	public void setAction(EsAction action) {
		this.action = action;
	}

	public EsRequest getRequest() {
		return request;
	}

	public void setRequest(EsRequest request) {
		this.request = request;
	}

	public EsThreadPool getThreadPool() {
		return threadPool;
	}

	public void setThreadPool(EsThreadPool threadPool) {
		this.threadPool = threadPool;
	}

	public EsClient getClient() {
		return client;
	}

	public void setClient(EsClient client) {
		this.client = client;
	}

}
