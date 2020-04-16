package com.example.test.Controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.test.Model.ShoppingModel;
import com.example.test.Service.ShoppingService;

@RestController
@RequestMapping("api/shopping")
public class ShoppingController {
	
	@Autowired
	private ShoppingService shoppingService;
	
	@PostMapping
	@ResponseStatus(code= HttpStatus.CREATED)
	public Map<String, Object> post(@RequestBody ShoppingModel shoppingModel){
		this.shoppingService.create(shoppingModel);
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("success", Boolean.TRUE);
		map.put("pesan", "Selamat Data Berhasil Dimasukkan");
		return map;
	}
	
	@GetMapping
	@ResponseStatus(code=HttpStatus.OK)
	public List<ShoppingModel> get(){
		List<ShoppingModel> shoppingModelList = new ArrayList<ShoppingModel>();
		shoppingModelList = this.shoppingService.read();
		return shoppingModelList;
	}
	
	@GetMapping("/{id}")
	@ResponseStatus(code=HttpStatus.OK)
	public Map<String, Object> read1 (@PathVariable String id){

		shoppingService.delete(id);
	
	Map<String, Object> map = new HashMap<String, Object>();
	map.put("success", Boolean.TRUE);
	map.put("Pesan", "Data Anda Ditemukan");
	return map;
	}
	
	@PutMapping
	@ResponseStatus(code = HttpStatus.OK)
	public Map<String, Object> put(@RequestBody ShoppingModel shoppingModel){
		
		this.shoppingService.update(shoppingModel);
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("Success", "Data Berhasil Disimpan");
		return map;
	}
	
	
	@DeleteMapping("/{id}")
	@ResponseStatus(code= HttpStatus.GONE)
	public Map<String, Object> delete (@PathVariable String id){

			shoppingService.delete(id);
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("success", Boolean.TRUE);
		map.put("Pesan", "Data Anda Telah Hilang");
		return map;
	}
	
	
	

}
