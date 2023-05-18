package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.UserProductDto;
import com.example.demo.service.UserProductService;

@RestController
public class UserProductController {

	@Autowired
	private UserProductService userProductService;

	@PostMapping("userProduct")
	public ResponseEntity<?> createUserProduct(@RequestBody UserProductDto userProduct){
		UserProductDto result = userProductService.createUserProduct(userProduct);
		if(result != null) {
			return ResponseEntity.ok(result);
		}else {
			return ResponseEntity.ok(null);
		}
	}

}
