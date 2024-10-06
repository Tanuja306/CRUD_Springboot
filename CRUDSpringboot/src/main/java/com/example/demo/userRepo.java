package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface userRepo extends JpaRepository<user,Integer>{

	
	public user findByNameAndPass(String name,String pass);
}
