package com.java8.defaul;

interface A
{
	
	static void show()
	{
		System.out.println("static method");
		
	}
}


public class Static {

	public static void main(String[] args) {
		A.show();

	}

}
