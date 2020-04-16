package com.example.test.Controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.test.Model.UserModel;
import com.example.test.Service.UserService;

@RestController
@RequestMapping("api/users")
public class UserController {

	@Autowired
	private UserService userService;
	
	@PostMapping("/signup")
	@ResponseStatus(code= HttpStatus.CREATED)
	public Map<String, Object> post(@RequestBody UserModel userModel){
		this.userService.create(userModel);
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("success", Boolean.TRUE);
		map.put("pesan", "Selamat Data Berhasil Dimasukkan");
		return map;
	}
	
	@PostMapping("/signin")
	@ResponseStatus(code= HttpStatus.CREATED)
	public Map<String, Object> post2(@RequestBody UserModel userModel){
		this.userService.create(userModel);
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("success", Boolean.TRUE);
		map.put("pesan", "Selamat Data Berhasil Dimasukkan");
		return map;
	}
	
	@GetMapping
	@ResponseStatus(code=HttpStatus.OK)
	public List<UserModel> get(){
		List<UserModel> userModelList = new ArrayList<UserModel>();
		userModelList = this.userService.read();
		return userModelList;
	}
}
