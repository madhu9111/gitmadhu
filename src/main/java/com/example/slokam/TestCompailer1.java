package com.example.slokam;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestCompailer1 {

	//http://localhost:8080/getmap?id=123&sname=abc
	@GetMapping("getmap")
	public String getBookBYId(@RequestParam(name="id") Integer id,@RequestParam(name="sname") String name) {
		System.out.println("ID::"+id);
		System.out.println("NAME::"+name);
		
		return "hello";
	}
	
	//http://localhost:8080/getmap1?id=123&name=abc
	@GetMapping("getmap1")
	public String getBookBYId1(Integer id,String name) {
		System.out.println("ID::"+id);
		System.out.println("NAME::"+name);
		
		return "hello";
	}
	
	
	//http://localhost:8080/storyById/22/kings
		@GetMapping("storyById/{sid}/{sname}")
		public String getStoryById( @PathVariable(name="sname") String name , 
				@PathVariable(name="sid") Integer id) {
			System.out.println("Sname::"+name);
			System.out.println("Sid::"+id);
			return "Book Name";
		
	
			
			
			
			
			
			
			
			
			
			
			
			
			
			
	
		}
}
