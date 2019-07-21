package d_设计模式之结构型模式.享元模式;

public class TestClass {
	public static void main (String[] args) {
		String[] teacherType = new String[]{ "语文老师", "数学老师", "英语老师" };

		for ( int i = 0; i < 10; i ++ ) {
			int randomNum = (int) ( Math.random() * teacherType.length );
			Teacher teacher = TeacherFactory.getTeacher( teacherType[ randomNum ] );
			teacher.report();
		}
	}
}
