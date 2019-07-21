package e_设计模式之行为型模式.策略模式;

import java.util.HashMap;
import java.util.Map;

public class StrategyFactory {
	private static Map<String, Strategy> strateges = new HashMap<>();
	static {
		strateges.put( ActivityType.DA_ZHE, new DazheStrategy() );
		strateges.put( ActivityType.MAN_JIAN, new ManjianStrategy() );
		strateges.put( ActivityType.CHOU_JIANG, new ChoujiangStrategy() );
	}


	public static Strategy getStrategy (String activityType) {
		return strateges.get( activityType );
	}

	public interface ActivityType {
		String MAN_JIAN = "MAN_JIAN";
		String DA_ZHE = "DA_ZHE";
		String CHOU_JIANG = "CHOU_JIANG";
	}
}
