package kodlamaioDemo;

import kodlamaioDemo.business.CategoryManager;
import kodlamaioDemo.business.CourseManager;
import kodlamaioDemo.business.EducatorManager;
import kodlamaioDemo.core.logging.DatabaseLogger;
import kodlamaioDemo.core.logging.FileLogger;
import kodlamaioDemo.core.logging.Logger;
import kodlamaioDemo.dataAccess.HibernateCourseDao;
import kodlamaioDemo.dataAccess.HibernateEducatorDao;
import kodlamaioDemo.dataAccess.JdbcCategoryDao;
import kodlamaioDemo.entities.Category;
import kodlamaioDemo.entities.Course;
import kodlamaioDemo.entities.Educator;

public class Main {

	public static void main(String[] args) throws Exception {
		Logger[] loggers = {new DatabaseLogger(), new FileLogger()};
		
		Category category1 = new Category(1, "Programlama2");
		CategoryManager categoryManager = new CategoryManager(new JdbcCategoryDao(),loggers);
		categoryManager.add(category1);

		Course course1 = new Course(1, "Java Programlama2", "Java eğitimi verilecektir", 0);
		CourseManager courseManager = new CourseManager(new HibernateCourseDao(),loggers);
		courseManager.add(course1);
		
		Educator educator1 = new Educator(1,"Engin","Demiroğ");
		EducatorManager educatorManager = new EducatorManager(new HibernateEducatorDao(), loggers);
		educatorManager.add(educator1);

	}

}
