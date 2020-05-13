package org.demo;


import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class HibernateDaoImpl {

	@Autowired
	private SessionFactory sessionFactory;
	
	public int getEmployeeCount() {
		String hql = "SELECT count(*) from Employee";
		Query query = getSessionFactory().openSession().createQuery(hql);
		return ((Long) query.uniqueResult()).intValue();
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
}
