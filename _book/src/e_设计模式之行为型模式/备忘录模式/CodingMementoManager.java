package e_设计模式之行为型模式.备忘录模式;

import java.util.ArrayList;
import java.util.Stack;

public class CodingMementoManager {
	private Stack<CodingMemento> allMemento = new Stack<>();

	/**
	 * 添加一个存档
	 * @param codingMemento
	 */
	public void addMemento (CodingMemento codingMemento) {
		allMemento.push( codingMemento );
		System.out.println( "存档成功" );
	}

	/**
	 * 获取一个存档
	 * @return
	 */
	public CodingMemento getCodingMemento () {
		System.out.println( "获取存档成功" );
		return allMemento.pop();
	}
}
