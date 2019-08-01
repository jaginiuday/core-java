package com.examples.lamdaex;

import java.util.ArrayList;

public class Example1 {

	public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(); 
        arrayList.add(1); 
        arrayList.add(2); 
        arrayList.add(3); 
        arrayList.add(4); 
  
        System.out.println("Using lambda expression to print all elements ");
        arrayList.forEach(number -> System.out.println(number)); 
  
        System.out.println("Using lambda expression to print even elements"); 
        arrayList.forEach(numer -> { if (numer % 2 == 0) System.out.println(numer); }); 
	}

}
