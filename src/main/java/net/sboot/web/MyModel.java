package net.sboot.web;

public class MyModel {
	private String name;

	public MyModel(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "MyModel [name=" + name + "]";
	}
	
}
