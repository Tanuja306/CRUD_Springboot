package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class userdao implements userService {
	
	@Autowired
	userRepo ur;

	@Override
	public user regiter(user u1) {
		
		return ur.save(u1);
	}

	@Override
	public List<user> getAllInfo() {
		
		return ur.findAll();
	}

	@Override
	public void deldata(int id) {
		
		ur.deleteById(id);
		
	}

	@Override
	public user editdata(int id) {
		
		return ur.getById(id);
	}

	@Override
	public user check(String name, String pass) {
	
		return ur.findByNameAndPass(name, pass);
	}

	

}
