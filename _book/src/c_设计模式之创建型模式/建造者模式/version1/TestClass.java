package c_设计模式之创建型模式.建造者模式.version1;

public class TestClass {
	public static void main (String[] args) {
		// 创建一个前端课程
		Course FECourse = new Course.CourseBuilder().buildCourseId( 1 )
										.buildCourseName( "FECourse" )
										.buildCoursePrice( 2000 )
										.buildDescription( "前端课程" )
										.build();
		System.out.println( FECourse );
	}
}
