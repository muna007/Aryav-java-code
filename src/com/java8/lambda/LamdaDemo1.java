package com.java8.lambda;
	
	interface Sayable{  
	    public String say();  
	}  
	public class LamdaDemo1 {
	public static void main(String[] args) {  
	    Sayable s=()->{  
	        return "I have nothing to say.";  
	    };  
	    System.out.println(s.say());  
	}  
	}  


