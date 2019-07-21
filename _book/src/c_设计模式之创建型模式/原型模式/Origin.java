package c_设计模式之创建型模式.原型模式;

import java.util.ArrayList;

public class Origin implements Cloneable {
	private ArrayList<String> list = new ArrayList<>();
	public Origin () {}

	public ArrayList<String> getList () {
		return list;
	}

	public void setList (ArrayList<String> list) {
		this.list = list;
	}

	@Override
	protected Object clone () throws CloneNotSupportedException {
		Origin newOrigin = (Origin) super.clone();
		newOrigin.setList( new ArrayList<>( newOrigin.getList() ) );
		return newOrigin;
	}
}
