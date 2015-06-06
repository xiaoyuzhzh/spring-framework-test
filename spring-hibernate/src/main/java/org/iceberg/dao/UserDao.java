package org.iceberg.dao;

import org.iceberg.model.User;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class UserDao extends BaseDao{
	
	@Transactional
	public void save(User user){
		getSession().save(user);
	}
	
	public User queryUnique(String id){
		return null;
	}
	
	public void queryList(){
		
	}
}
