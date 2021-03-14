package com.dapengwang.helloworld;

public class Greeting {

	private final long id;
	private final String content;
	private final String origin;

	public Greeting(long id, String content, String origin) {
		this.id = id;
		this.content = content;
		this.origin = origin;
	}

	public long getId() {
		return id;
	}

	public String getContent() {
		return content;
	}

	public String getOrigin() {
		return origin;
	}
}
