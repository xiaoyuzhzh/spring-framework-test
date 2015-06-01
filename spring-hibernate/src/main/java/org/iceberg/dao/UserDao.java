package org.iceberg.dao;

import org.iceberg.model.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao extends BaseDao{
	public void save(User user){
		
	}
	
	public User queryUnique(String id){
		return null;
	}
	
	public void queryList(){
		
	}
}
