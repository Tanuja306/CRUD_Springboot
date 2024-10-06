package com.example.demo;

import java.util.List;
import java.util.Optional;

public interface userService {
	
	public user regiter(user u1);

	public List<user> getAllInfo();
	
	public void deldata(int id);

	public user editdata(int id);
	
	public user check(String name,String pass);
}
