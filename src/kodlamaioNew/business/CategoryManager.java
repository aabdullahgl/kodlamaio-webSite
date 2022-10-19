package kodlamaioNew.business;

import kodlamaioNew.core.logging.Logger;
import kodlamaioNew.dataAccess.CategoryDao;
import kodlamaioNew.entities.Category;
import kodlamaioNew.entities.Course;

public class CategoryManager {
	private CategoryDao categoryDao;
	private Category[] categories;
	private Logger[] loggers;

	public CategoryManager(CategoryDao categoryDao, Category[] categories, Logger[] loggers) {
		this.categoryDao = categoryDao;
		this.categories = categories;
		this.loggers = loggers;
	}

	public void add(Category category, Category[] categories, Logger[] loggers, Course course) throws Exception {

		for (Category currentCategory : categories) {
			if (currentCategory.getTypeName() == category.getTypeName()) {
				throw new Exception("Kategori adı mevcuttur");
			}

		}
		categoryDao.add(category);
		for (Logger logger : loggers) {
			logger.log(course.getName());
		}

	}
}
