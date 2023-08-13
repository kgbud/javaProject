package com.Array;

public class Price implements Comparable<Price> {
	
	int dollar;
	String brand;
	Price(int price,String name){
     
		dollar = price;
		brand = name;

}
	@Override
	public String toString() {
		return "Price [dollar=" + dollar + ", brand=" + brand + "]";
	}
	@Override
	public int compareTo(Price o) {
		if(dollar < o.dollar) {
			return -1;
		}
		else if(dollar<o.dollar) {
			return 1;
	 }
			else {
				return 0;
			}
		}
		
	}
	
	

