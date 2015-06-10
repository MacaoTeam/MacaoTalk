package com.my.dao;

import java.util.ArrayList;

import com.my.exception.AddException;
import com.my.exception.DeleteException;
import com.my.exception.UpdateException;
import com.my.vo.User;

public class UserDAOOracle implements UserDAO {
	static {
		// 한번만 미리 클래스를 로드 한다.
		// 1)DB용 JDBC 드라이버 압축파일에 저장 되어있는 핵심클래스 로드
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public UserDAOOracle() {

	}

	@Override
	public void insert(User user) throws AddException {
		// TODO Auto-generated method stub

	}

	@Override
	public void Update(User user) throws UpdateException {
		// TODO Auto-generated method stub

	}

	@Override
	public void Delete(User user) throws DeleteException {
		// TODO Auto-generated method stub

	}

	@Override
	public ArrayList<User> selectAll() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User selectByid(String id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<User> selectByname(String name) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(ArrayList<User> users) throws Exception {
		// TODO Auto-generated method stub

	}
}
