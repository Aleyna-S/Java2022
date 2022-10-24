package kodlamaioDemo.business;

import kodlamaioDemo.core.logging.Logger;
import kodlamaioDemo.dataAccess.EducatorDao;
import kodlamaioDemo.entities.Educator;

public class EducatorManager {
	private EducatorDao educatorDao;
	private Logger[] loggers;

	public EducatorManager(EducatorDao educatorDao, Logger[] loggers) {
		this.educatorDao = educatorDao;
		this.loggers = loggers;
	}

	public void add(Educator educator) {
		educatorDao.add(educator);
		for (Logger logger : loggers) {
			logger.log(educator.getFirsName() + " " + educator.getLastName());
		}

	}

}
