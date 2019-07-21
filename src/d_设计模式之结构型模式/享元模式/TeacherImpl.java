package d_设计模式之结构型模式.享元模式;

import java.text.MessageFormat;

public class TeacherImpl implements Teacher {
	private String school = "呵呵学校"; // 学校名称
	private String teacherType;        // 教师类型

	public TeacherImpl (String teacherType) {
		this.teacherType = teacherType;
	}

	public String getSchool () {
		return school;
	}

	public void report () {
 		String description = teacherType + "汇报教学情况";
 		System.out.println( description );
   }
}
