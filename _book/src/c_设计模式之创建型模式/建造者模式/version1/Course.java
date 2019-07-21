package c_设计模式之创建型模式.建造者模式.version1;

public class Course {
	private String courseName;
	private String description;
	private int courseId;
	private double coursePrice;
	private int courseNumOfPeople;

	public Course (CourseBuilder courseBuilder) {
		this.courseName = courseBuilder.courseName;
		this.description = courseBuilder.description;
		this.courseId = courseBuilder.courseId;
		this.coursePrice = courseBuilder.coursePrice;
		this.courseNumOfPeople = courseBuilder.courseNumOfPeople;
	}

	// 建造者
	public static class CourseBuilder {
		private String courseName;
		private String description;
		private int courseId;
		private double coursePrice;
		private int courseNumOfPeople;

		public CourseBuilder buildCourseName (String courseName) {
			this.courseName = courseName;
			return this;
		}

		public CourseBuilder buildDescription (String description) {
			this.description = description;
			return this;
		}

		public CourseBuilder buildCourseId (int courseId) {
			this.courseId = courseId;
			return this;
		}

		public CourseBuilder buildCoursePrice (double coursePrice) {
			this.coursePrice = coursePrice;
			return this;
		}

		public CourseBuilder buildCourseNumOfPeople (int courseNumOfPeople) {
			this.courseNumOfPeople = courseNumOfPeople;
			return this;
		}

		public Course build () {
			return new Course( this );
		}
	}
}
