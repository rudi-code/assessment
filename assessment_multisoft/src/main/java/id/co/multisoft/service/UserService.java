package id.co.multisoft.service;

import java.util.List;

import id.co.multisoft.entity.User;

public interface UserService {
	
	/*RETRIEVE*/
	public List<User> getAllUser(String tableName);
	
	/*INSERT UPDATE*/
	public String createUser(User user);


}
