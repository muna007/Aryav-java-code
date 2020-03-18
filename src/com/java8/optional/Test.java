package com.java8.optional;
import java.util.Optional;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] s=new String[5];
		s[0]="ram";
		s[1]="sam";
		System.out.println(s[1].toUpperCase());
		Optional<String> o=Optional.ofNullable(s[2]);
		System.out.println(o);
		if(o.isPresent()) {
			System.out.println("value existed");
		}
		else
		{
			System.out.println("value not existed");
		}

	}

}
