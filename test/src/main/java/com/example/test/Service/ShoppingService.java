package com.example.test.Service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.test.Model.ShoppingModel;
import com.example.test.Repository.ShoppingRepository;



@Service
@Transactional
public class ShoppingService {
		
		@Autowired
		private ShoppingRepository shoppingRepository;
		
		public void create(ShoppingModel shoppingModel) {
			shoppingRepository.save(shoppingModel);
		}
		
		public List<ShoppingModel> read(){
			return shoppingRepository.findAll();
		}
		
		public void read1(String id) {
			this.shoppingRepository.findById(id);
		}
		public void update(ShoppingModel shoppingModel) {
			shoppingRepository.save(shoppingModel);
		}
		
		public void delete(String id) {
			this.shoppingRepository.deleteById(id);
		}
		
		
}
