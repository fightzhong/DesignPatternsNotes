package d_设计模式之结构型模式.桥接模式.Test;

public abstract class Bank {
	protected SaveType saveType;

	public Bank (SaveType saveType) {
		this.saveType = saveType;
	}

	public abstract void printDescription ();
}
