package id.co.multisoft.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import id.co.multisoft.dao.UserDao;
import id.co.multisoft.entity.User;
import id.co.multisoft.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserDao userDao;
	
	@Override
	public List<User> getAllUser(String tableName) {

		List<User> listUser = userDao.getAlluser(tableName);
		return listUser;
	}

	@Override
	public String createUser(User user) {

		if(userDao.validasiIdAndEmail(user.getId(), user.getEmail())) {
			return "User with id = "+user.getId()+" or Email = "+user.getEmail()+" already exist";
		}else {
			String userCreated = userDao.callSP(user);
			return userCreated;
		}

	}

}
