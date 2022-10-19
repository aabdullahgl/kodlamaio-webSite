package kodlamaioNew.dataAccess;

import kodlamaioNew.entities.Category;
import kodlamaioNew.entities.Course;

public class JdbcCourseDao implements CourseDao, CategoryDao {

	@Override
	public void add(Course course) {
		System.out.println("JDBC ile veritabanına kaydedildi (Kurs)");
	}

	@Override
	public void add(Category category) {
		System.out.println("---------------------------");
		System.out.println("JDBC ile veritabanına kaydedildi (Kategori)");

	}

}
