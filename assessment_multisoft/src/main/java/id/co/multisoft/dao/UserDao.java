package id.co.multisoft.dao;

import java.util.List;
import java.util.Map;

import id.co.multisoft.entity.User;

public interface UserDao {
	
	/*RETRIEVE*/
	public List<User> getAlluser(String tableName);
	public User getUserById(String id, String tableName);
	
	/*INSERT UPDATE*/
	String callSP(User user);
	
	/*OTHER*/
	public boolean validasiIdAndEmail(String id, String email);

	
	/*public List<User> getAlluserA();
	public List<User> getAlluserB();
	public List<User> getAlluserC();*/
	

}
