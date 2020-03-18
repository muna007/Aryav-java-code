package com.java8.lambda;//Lambda expression with one parameter
	interface C{  
	    public String say(String name);  
	}  
	  
	public class LamdaDemo2 {
		
	    public static void main(String[] args) {  
	      
	        // Lambda expression with single parameter.  
	        C s1=(name)->{  
	            return "Hello, "+name;  
	        };  
	        System.out.println(s1.say("Sonoo"));  
	          
	        // You can omit function parentheses    
	        C s2= name ->{  
	            return "Hello, "+name;  
	        };  
	        System.out.println(s2.say("Sonoo"));  
	    }  
	}  


