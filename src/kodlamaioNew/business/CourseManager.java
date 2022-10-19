package kodlamaioNew.business;

import java.util.ArrayList;
import java.util.List;

import kodlamaioNew.core.logging.Logger;
import kodlamaioNew.dataAccess.CourseDao;
import kodlamaioNew.entities.Course;

public class CourseManager {
	private CourseDao courseDao;
	private Course[] courses;
	// private List<Course> courses = new ArrayList<Course>();
	private Logger[] loggers;

	public CourseManager(CourseDao courseDao, Logger[] loggers, Course[] courses) {
		this.courseDao = courseDao;
		this.loggers = loggers;
		this.courses = courses;

	}

	public void add(Course course, Course[] courses) throws Exception {
		if (this.courses.length > 0) {
			for (Course currentCourse : this.courses) {
				if (currentCourse.getName() == course.getName()) {
					throw new Exception("Kurs adı mevcuttur");
				}
			}
			if (course.getUnitPrice() <= 0) {
				throw new Exception("Kursun fiyatı 0 ve daha küçük olamaz");
			}

		}
		//this.courses.add(course);
		this.courseDao.add(course);
		for (Logger logger : loggers) {
			logger.log(course.getName());

		}
	}
}
