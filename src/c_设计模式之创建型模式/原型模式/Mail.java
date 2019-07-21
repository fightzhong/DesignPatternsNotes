package c_设计模式之创建型模式.原型模式;

import java.util.ArrayList;

public class Mail implements Cloneable {
	private String name;
	private String address;
	private String content;

	public Mail () {}

	public String getName () {
		return name;
	}

	public void setName (String name) {
		this.name = name;
	}

	public String getAddress () {
		return address;
	}

	public void setAddress (String address) {
		this.address = address;
	}

	public String getContent () {
		return content;
	}

	public void setContent (String content) {
		this.content = content;
	}

	@Override
	protected Object clone () throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public String toString () {
		return "Mail{" +
		"name='" + name + '\'' +
		", address='" + address + '\'' +
		", content='" + content + '\'' +
		'}';
	}
}
