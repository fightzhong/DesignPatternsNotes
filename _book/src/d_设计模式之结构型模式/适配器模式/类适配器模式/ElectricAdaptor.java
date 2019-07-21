package d_设计模式之结构型模式.适配器模式.类适配器模式;

public class ElectricAdaptor extends Electric_220V implements Electric_5V {
	@Override
	public int output5VElectric () {
		// 电源适配器接收Electric_220V的交流电
		int inputElectric = super.output220Electric();

		// 将其转换为5V的直流电输出, 这一步可以理解为变压等
		int outputElectric = inputElectric / 44;

		// 最后将这个5V的直流电输出
		return outputElectric;

	}
}
