package com.my.dao;

import java.util.ArrayList;

import com.my.exception.AddException;
import com.my.exception.DeleteException;
import com.my.exception.UpdateException;
import com.my.vo.User;

public interface UserDAO {

	void insert(User user) throws AddException;

	void Update(User user) throws UpdateException;

	void Delete(User user) throws DeleteException;

	ArrayList<User> selectAll() throws Exception;

	User selectByid(String id) throws Exception;

	ArrayList<User> selectByname(String name) throws Exception;

	void save(ArrayList<User> users) throws Exception;
}
