package kodlamaioDemo.business;

import kodlamaioDemo.core.logging.Logger;
import kodlamaioDemo.dataAccess.CourseDao;
import kodlamaioDemo.entities.Course;

public class CourseManager {
	private CourseDao courseDao;
	private Logger[] loggers;

	// CourseManager 'new'lendiğinde bana bir courseDao ver. Böylelikle jdbc,hibernate gibi şeylere olan bağımlılık sona erecek
	public CourseManager(CourseDao courseDao, Logger[] loggers) {
		this.courseDao = courseDao;
		this.loggers = loggers;
	}

	public void add(Course course) throws Exception {
		Course[] courses = { new Course(1, "Java Programlama", "Java eğitimi verilecektir", 0),
				new Course(2, "Javascript", "JavaScript eğitimi verilecektir", 20) };
		for (Course c : courses) {
			if (course.getName().equals(c.getName())) {
				throw new Exception("Kursun adı aynı olamaz");
			} else if (course.getPrice() < 0)
				throw new Exception("Kursun fiyatı 0'dan küçük olamaz");

		}
		courseDao.add(course);

		for (Logger logger : loggers) {
			logger.log(course.getName());
		}

	}

}
