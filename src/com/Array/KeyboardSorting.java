package com.Array;
import java.util.ArrayList;
import java.util.Collections;

public class KeyboardSorting {

	public static void main(String[] args) {
		Keyboard keyboard1 = new Keyboard(100,"Lenovo");
		Keyboard keyboard2 = new Keyboard(600,"Sony");
		Keyboard keyboard3 = new Keyboard(200,"Genovo");
		Keyboard keyboard4 = new Keyboard(800,"Senovo");
		
		ArrayList<Keyboard>keyboards = new ArrayList<>();
		
		keyboards.add(keyboard1);
		keyboards.add(keyboard2);
		keyboards.add(keyboard3);
		keyboards.add(keyboard4);
		
		System.out.println("-----before sorting------ " + keyboards);
		
		Collections.sort(keyboards);
		
		System.out.println("-----after sorting----- "+ keyboards);

	}

}
