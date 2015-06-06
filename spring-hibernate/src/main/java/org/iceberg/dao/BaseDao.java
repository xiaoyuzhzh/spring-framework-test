package org.iceberg.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class BaseDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	protected Session getSession() {
		System.out.println("asdfasdf");
		Session session = this.sessionFactory.getCurrentSession();
		return session;
	}
}
