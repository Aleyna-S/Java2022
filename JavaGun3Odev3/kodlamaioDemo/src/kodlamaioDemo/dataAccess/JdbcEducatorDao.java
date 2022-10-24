package kodlamaioDemo.dataAccess;

import kodlamaioDemo.entities.Educator;

public class JdbcEducatorDao implements EducatorDao {
	
	public void add(Educator educator) {
		System.out.println("Eğitimci jdbc ile veri tabanına eklendi:"+ educator.getFirsName() + " " + educator.getLastName());
	}


}
