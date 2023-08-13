package com.Array;

import java.util.ArrayList;
import java.util.Collections;

public class PriceSorting {

	public static void main(String[] args) {
		
		Price price1 = new Price(100,"Honda");
		Price price2 = new Price(30,"Camry");
		Price price3 = new Price(1000,"Mazda");
		
		ArrayList<Price>prices = new ArrayList<>();
		
		
		
		prices.add(price1);
		prices.add(price2);
		prices.add(price3);
		
		System.out.println("---Before sorting ----- "+ prices);
		Collections.sort(prices);
		
		System.out.println("----After sorting----" + prices);
		
		
	}

}
