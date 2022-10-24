package kodlamaioDemo.business;

import kodlamaioDemo.core.logging.Logger;
import kodlamaioDemo.dataAccess.CategoryDao;
import kodlamaioDemo.entities.Category;

public class CategoryManager {
	private CategoryDao categoryDao;
	private Logger[] loggers;

	public CategoryManager(CategoryDao categoryDao, Logger[] loggers) {
		this.categoryDao = categoryDao;
		this.loggers = loggers;
	}

	public void add(Category category) throws Exception {
		Category[] categories = { new Category(1, "Programlama"), new Category(2, "Tümü") };
		for (Category cat : categories) {
			if (category.getName().equals(cat.getName())) {
				throw new Exception("İki kategorinin  ismi aynı olamaz!");
			}
		}

		categoryDao.add(category);
		for (Logger logger : loggers)
			logger.log(category.getName());

	}

}
