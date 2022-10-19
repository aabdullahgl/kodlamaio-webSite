package kodlamaioNew;

import java.util.ArrayList;
import java.util.List;

import kodlamaioNew.business.CategoryManager;
import kodlamaioNew.business.CourseManager;
import kodlamaioNew.core.logging.DataBaseLogger;
import kodlamaioNew.core.logging.FileLogger;
import kodlamaioNew.core.logging.Logger;
import kodlamaioNew.core.logging.MailLogger;
import kodlamaioNew.dataAccess.CourseDao;
import kodlamaioNew.dataAccess.HibernateCourseDao;
import kodlamaioNew.dataAccess.JdbcCourseDao;
import kodlamaioNew.entities.Category;
import kodlamaioNew.entities.Course;

public class Main {

	public static void main(String[] args) throws Exception {

		Course course1 = new Course();
		course1.setName("java");
		course1.setUnitPrice(5);
		Course course2 = new Course();
		course2.setName("javaa");

		//List<Course> courses = new ArrayList<Course>() ;
		Course[] courses=new Course[] {course2};
		

		Logger[] loggers = { new DataBaseLogger(), new FileLogger(), new MailLogger() };

		CourseManager courseManager = new CourseManager(new HibernateCourseDao(), loggers, courses);
		courseManager.add(course1, courses);

		Category[] categories = new Category[] { new Category(1, "programlama") };
		Category category1 = new Category(2, "programlamaa");

		CategoryManager categoryManager = new CategoryManager(new HibernateCourseDao(), categories, loggers);
		categoryManager.add(category1, categories, loggers, course1);

	}

}
