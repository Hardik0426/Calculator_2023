package org.maisurha.calculator;

import java.util.Scanner;

/**
 * Hello world!
 *@author hardi
 */
public class App 
{
    @SuppressWarnings("resource")
	public static void main( String[] args )
    {
    	//Variable declaration
    	float a=0,b=0;
    	int choice=0;
    	CalculatorLogic c=new CalculatorLogic();
    	Scanner s=new Scanner(System.in);
    	do{
    		System.out.println("List of operations you do have : ");
    		System.out.println("0. Exit");
    		System.out.println("1. Addition");
    		System.out.println("2. Subtraction");
    		System.out.println("3. Multiplication");
    		System.out.println("4. Division");
    		System.out.println("Your choice : ");
    		
    		try{choice=s.nextInt();}catch(Exception e) {System.out.println(e.toString());}
    		if(choice==0)
    		{
    			System.out.println("Calculator closed!!");
    			System.exit(0);
    		}
    		else if(choice<5)
    		{
    			try {
    			System.out.println("Enter the 1st digit: ");
    			a=s.nextFloat();
    			System.out.println("Enter the 2nd digit: ");
    			b=s.nextFloat();  
    			System.out.println("Calculations :");
    			}
    			catch(Exception e)
    			{
    				System.out.println(e);
    				break;
    			}
		    		switch(choice)
		    		{
		    			case 1:
		    				System.out.println(" "+a);
		    				System.out.println("+"+b);
		    				System.out.println("---");
		    				System.out.println(c.add(a, b)+"\n");
		    				break;
		    			case 2:
		    				System.out.println(" "+a);
		    				System.out.println("-"+b);
		    				System.out.println("---");
		    				System.out.println(c.sub(a, b)+"\n");
		    				break;
		    			case 3:
		    				System.out.println(" "+a);
		    				System.out.println("*"+b);
		    				System.out.println("---");
		    				System.out.println(c.mul(a, b)+"\n");
		    				break;
		    			case 4:
		    				System.out.printf(a+"/"+b+"="+c.div(a, b)+"\n");
		    				break;
		    		}
    		}
    		else {
    			System.out.println("NOT VALID OPTION!!");
    		}
    	}while(choice!=0);	
    }
}
