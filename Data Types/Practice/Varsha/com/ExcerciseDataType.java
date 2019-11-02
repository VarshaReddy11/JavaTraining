package com;
public class ExcerciseDataType {

	/**
	 * This data type program you need to create the following:
	 * 
	 *  1. Create at least three identifiers
	 *  2. Create few variables using different data types
	 *  3. Add few arithmetic operations
	 *  4. Add few logical operators 	 
	 *  
	 */

	public static void main( String[] args ){  
 
		//TODO you need to create your logic here..
		//creating variables and using arithmetic operations
    	int a = 20;
        int b = 30;
        int c = a+b;
        boolean d = a==b;
        System.out.println("Is a=b: " + d);
        System.out.println("a+b=" + c);
        
        //finding if the number is even or odd
        
        int num = 10;
        int rem = num % 2;
        if (rem == 0)
        {
        System.out.println("num is even");	
        }
        
        else {
        System.out.println("num is odd");
        }
        
        //using logical operators
        
        boolean x = true;
        boolean y = false;

        System.out.println("x && y = " + (x&&y));
        System.out.println("x || y = " + (x||y) );
        System.out.println("!(x && y) = " + !(x && y));
        

	}
}


