package com.example.test.Service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.test.Model.UserModel;
import com.example.test.Repository.UserRepository;

@Service
@Transactional
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public void create(UserModel userModel) {
		userRepository.save(userModel);
	}
	
	public List<UserModel> read(){
		return userRepository.findAll();
	}
	
	

}
