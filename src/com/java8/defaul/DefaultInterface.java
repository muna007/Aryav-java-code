package com.java8.defaul;

interface Phone
{
	void call();
	default void message()
	{
		System.out.println("sent");
	}
	static void m1()
	{
		System.out.println("m1 method");
	}
}

class AndriodPhone implements Phone
{

	@Override
	public void call() {
		System.out.println("calling");
		
	}
	
}

public class DefaultInterface {
	public static void main(String[] args)
	{
		Phone p=new AndriodPhone();
		p.call();
		p.message();
        Phone.m1();
	}
	

}
