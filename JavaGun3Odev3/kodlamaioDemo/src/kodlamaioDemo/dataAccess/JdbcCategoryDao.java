package kodlamaioDemo.dataAccess;

import kodlamaioDemo.entities.Category;

public class JdbcCategoryDao implements CategoryDao {
	
	public void add(Category category) {
		System.out.println("Kategori jdbc ile veri tabanına eklendi:" + category.getName());
	}

}
