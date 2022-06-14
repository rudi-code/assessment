package id.co.multisoft.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import id.co.multisoft.entity.User;
import id.co.multisoft.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;


@RestController
@Api(value = "User")
public class UserController {
	
	@Autowired
	UserService userService;

	@ApiOperation(value = "Find All User_A", response = User.class)
	@RequestMapping(value = "/getAllUserA", method = RequestMethod.GET)
	public ResponseEntity<List<User>> getAllUserA(){
		List<User> listUser = userService.getAllUser("USER_A");
		return new ResponseEntity<List<User>>(listUser, HttpStatus.OK);
	}
	
	@ApiOperation(value = "Find All User_B", response = User.class)
	@RequestMapping(value = "/getAllUserB", method = RequestMethod.GET)
	public ResponseEntity<List<User>> getAllUserB(){
		List<User> listUser = userService.getAllUser("USER_B");
		return new ResponseEntity<List<User>>(listUser, HttpStatus.OK);
	}
	
	@ApiOperation(value = "Find All User_C", response = User.class)
	@RequestMapping(value = "/getAllUserC", method = RequestMethod.GET)
	public ResponseEntity<List<User>> getAllUserC(){
		List<User> listUser = userService.getAllUser("USER_C");
		return new ResponseEntity<List<User>>(listUser, HttpStatus.OK);
	}
	
	@ApiOperation(value = "Create User", response = User.class)
	@RequestMapping(value = "/createUser", method = RequestMethod.POST)
	public ResponseEntity<String> createUser(@RequestBody User user){
		String userCreate = userService.createUser(user);
		return new ResponseEntity<String>(userCreate, HttpStatus.OK);
	}

}
