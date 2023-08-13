package com.Array;

public class Monitor implements Comparable <Monitor>{
	
	int dollar;
	String brand;
	Monitor(int price, String name){
		
		dollar = price;
		brand = name;
		
	}
	@Override
	public String toString() {
		return "Monitor [dollar=" + dollar + ", brand=" + brand + "]";
	}
	@Override
	public int compareTo(Monitor o) {
		// TODO Auto-generated method stub
		
	 if(brand.compareTo(o.brand) != 0) {
			return brand.compareTo(o.brand);
		}	
		else {
		return 0;
	}
	}

	
	

}
