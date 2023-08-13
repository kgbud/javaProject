package com.Array;
import java.util.ArrayList;
import java.util.Collections;


public class Monitorsorting {

	public static void main(String[] args) {
	
	Monitor monitor1 = new Monitor(100,"Sony");
	Monitor monitor2 = new Monitor(200,"Samsung");
	Monitor monitor3 = new Monitor(300,"CG");
	Monitor monitor4 = new Monitor(70,"Toshiba");
	
	ArrayList<Monitor>monitors = new ArrayList<>();
	monitors.add(monitor1);
	monitors.add(monitor2);
	monitors.add(monitor3);
	monitors.add(monitor4);
	
	System.out.println("Price before sorting is ");
	System.out.println(monitors);
	
	Collections.sort(monitors);
	
	System.out.println("----------------");
	System.out.println(monitors);

	}

}
