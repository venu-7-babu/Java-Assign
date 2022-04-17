package com.bitlabs.dao;

import java.util.List;

import com.bitlabs.entity.Users;

public interface Dao {
	public boolean addUsers(Users usr);
	 public boolean deleteUserById(int id);
	 public List<Users> viewAllUsers();
	 public Users updateUserbyId(int id,String uname);
	 public Users getUserbyId(int id);
}
