package com.Array;

public class Keyboard implements Comparable<Keyboard> {
	
	int dollar;
	String brand;
	Keyboard(int price,String name){
		
		dollar = price;
		brand = name;

}
	@Override
	public String toString() {
		return "Keyboard [dollar=" + dollar + ", brand=" + brand + "]";
	}
	@Override
	public int compareTo(Keyboard o) {
		// TODO Auto-generated method stub
		if(brand.compareTo(o.brand) != 0) {
			return brand.compareTo(o.brand);
		}	
		else {
		return 0;
	}
	
	
	}
}

