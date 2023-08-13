package com.Array;

public class StringSorting implements Comparable <StringSorting>{
	private String brand;
	private int price;
	
	public StringSorting(String brand, int price) {
		this.brand = brand;
		this.price = price;
		
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "brand=" + brand + ", price=" + price + "";
	}

	@Override
	public int compareTo(StringSorting o) {
		// TODO Auto-generated method stub
		
		if(this.brand.compareTo(o.brand) != 0) {
			return this.brand.compareTo(o.brand);
		}
		return 0;
	}
	
	
	
	
	
	
	
	

}
