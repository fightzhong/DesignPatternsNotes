package d_设计模式之结构型模式.享元模式;

import java.util.HashMap;
import java.util.Map;

public class TeacherFactory {
	private static Map<String, Teacher> map = new HashMap<>();

	public static Teacher getTeacher (String teacherType) {
		// 如果不存在该类型的教师, 则创建并放入map中
		if ( !map.containsKey( teacherType ) ) {
			Teacher teacher = new TeacherImpl( teacherType );
			map.put( teacherType, teacher );
			System.out.println( "创建" + teacherType );
		}

		return map.get( teacherType );
	}
}
