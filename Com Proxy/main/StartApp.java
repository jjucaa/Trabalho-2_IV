package main;

import proxy.Ascii;
import proxy.Proxy;

public class StartApp {
	
	public static void main(String[] args) {
		
		Ascii desenhos = new Proxy("Lotus");
		
		desenhos.print();
		System.out.println();
		
		desenhos.print();
		System.out.println();
		
	}

}
