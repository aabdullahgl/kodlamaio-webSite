package kodlamaioNew.dataAccess;

import kodlamaioNew.entities.Category;
import kodlamaioNew.entities.Course;

public class HibernateCourseDao implements CourseDao, CategoryDao {

	@Override
	public void add(Course course) {
		System.out.println("Hibernate ile veritabanına kaydedildi (Kurs)");
	}

	@Override
	public void add(Category category) {
		System.out.println("---------------------------");
		System.out.println("Hibernate ile veritabanına kaydedildi (Kategori)");

	}

}
