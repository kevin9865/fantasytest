package com.fantasy.modules.userManage.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.fantasy.modules.userManage.dao.IUserDao;
import com.fantasy.modules.userManage.model.User;
import com.fantasy.modules.userManage.service.IUserService;

@Service(value="userService")
public class UserService implements IUserService{
	
	@Autowired
	@Qualifier("userDao")
	private IUserDao iUserDao;

	@Override
	public void add(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateUserAuth(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updatePwd(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User loginQuery(User user) {
		User u=iUserDao.userQuery(user);
		return u;
	}

	@Override
	public List<User> userQueryAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> userFuzzyQuery(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User userQuery(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String maxUserId() {
		// TODO Auto-generated method stub
		return null;
	}

}
