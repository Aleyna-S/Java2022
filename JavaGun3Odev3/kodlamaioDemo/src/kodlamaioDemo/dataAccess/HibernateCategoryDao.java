package kodlamaioDemo.dataAccess;

import kodlamaioDemo.entities.Category;

public class HibernateCategoryDao implements CategoryDao {
	
	public void add(Category category) {
		System.out.println("Kategori hibernate ile veri tabanına eklendi:" + category.getName());
	}

}
