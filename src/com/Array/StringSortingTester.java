package com.Array;

import java.util.ArrayList;
import java.util.Collections;

public class StringSortingTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		StringSorting stringSorting1 = new StringSorting("Sony", 20);
		StringSorting stringSorting2 = new StringSorting("Hp", 50);
		StringSorting stringSorting3 = new StringSorting("Lg", 45);
		StringSorting stringSorting4 = new StringSorting("Dell", 55);
		StringSorting stringSorting5 = new StringSorting("Lenovo", 60);
		
		
		ArrayList<StringSorting> stringSorting = new ArrayList<StringSorting>();
		
		stringSorting.add(stringSorting1);
		stringSorting.add(stringSorting2);
		stringSorting.add(stringSorting3);
		stringSorting.add(stringSorting4);
		stringSorting.add(stringSorting5);
		
		System.out.println("Before Sorting:");
		System.out.println(stringSorting);
		System.out.println("After Sorting: ");
		Collections.sort(stringSorting);
		System.out.println(stringSorting);
		
		

	}

}
