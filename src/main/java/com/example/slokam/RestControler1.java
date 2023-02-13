package com.example.slokam;

import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControler1 {

	
	@PostMapping("rest")
	public void savePriduct(@RequestBody product Product) {
		
		System.out.println(Product);
		
	}
	@PostMapping("rest1")
	public void savePriduct1(@RequestBody List<product> Product) {
		
		System.out.println(Product);
		
	}
}
