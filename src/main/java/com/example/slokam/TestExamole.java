package com.example.slokam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestExamole {

	
	@GetMapping("name")
	public String getString() {
		
		
		return "hello";
	}
	
	@GetMapping("id")
	
	public Integer getid()
	{
		return 256;
	}
	
	@GetMapping("list")
	public List getlist() {
		
		
		List list = new ArrayList<>();
		list.add(25);
		list.add(256);
		list.add(564);
		list.add(1236);
		
		
		return list;
	}
	@GetMapping()
	
	public Map getmap() {
		
		Map<String, Integer> map = new HashMap<>();
		map.put("one",1);
		map.put("two",2);
		map.put("three",3);
		map.put("four",4);
		map.put("five",5);
			return map;
	}
	
	@GetMapping("product")
	public product getproduct() {
		product p = new product(1,"laptop","black",456.25);
		
		return p;
	}
	@GetMapping("productlist")
	public List<product> getproductlist(){
		
		List<product> list = new ArrayList<>();
		product p = new product(1,"laptop","black",456.25);
		product p1 = new product(2,"desttop","green",564.25);
		product p2 = new product(3,"mobile","white",458.25);
		product p3 = new product(4,"tv","pink",236.25);
		product p4 = new product(5,"fan","blue",999.25);
		list.add(p);
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		
		return list;
	}
	@GetMapping("productmap")
	
	public Map<String, product> getmapproduct(){
		Map<String,product> map = new HashMap<>();
		
		product p = new product(1,"laptop","black",456.25);
		product p1 = new product(2,"desttop","green",564.25);
		product p2 = new product(3,"mobile","white",458.25);
		product p3 = new product(4,"tv","pink",236.25);
		product p4 = new product(5,"fan","blue",999.25);
		
		map.put("one",p);
		map.put("two",p1);
		map.put("three",p2);
		map.put("four",p3);
		map.put("five",p4);
		
		
		return map;
		
	}
	
	
	
	
	
	
	
	
}
