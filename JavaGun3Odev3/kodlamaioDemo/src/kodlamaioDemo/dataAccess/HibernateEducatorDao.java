package kodlamaioDemo.dataAccess;

import kodlamaioDemo.entities.Educator;

public class HibernateEducatorDao implements EducatorDao{
	
	public void add(Educator educator) {
		System.out.println("Eğitimci hibernate ile veri tabanına eklendi:" + educator.getFirsName()+ " " + educator.getLastName());
	}

}
