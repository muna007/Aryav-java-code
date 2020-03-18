package com.java8.lambda;

interface A
{
	public void show();
}
//class Xyz implements A
//{
//	public void show()
//	{
//		System.out.println("Hello");
//	}
//}
public class LamdaDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     A obj;
//     obj =new A()
//    		 {
//    	      public void show()
//    	      {
//    	    	  System.out.println("Hello");
//    	      }
//    		 };
     obj =() -> System.out.println("Hello");
     obj.show();
     
	}

}
