package kodlamaioDemo.dataAccess;

import kodlamaioDemo.entities.Course;

public class HibernateCourseDao implements CourseDao {
	
	public void add(Course course) {
		System.out.println("Kurs hibernate ile veri tabanına eklendi:" + course.getName());
	}

}
