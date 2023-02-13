package com.example.slokam;

public class product {

	private Integer id;
	private String name;
	private String colour;
	private Double price;
	
	
	public product(Integer id, String name, String colour, Double price) {
		super();
		this.id = id;
		this.name = name;
		this.colour = colour;
		this.price = price;
	}
	
	public product() {}
	
	@Override
	public String toString() {
		return "product [id=" + id + ", name=" + name + ", colour=" + colour + ", price=" + price + "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	
}
