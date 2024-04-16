/**
 * 
 */
package ConditionEx;

import java.util.Scanner;

public class rightAngle {

	public static void main(String[] args) {
		
 Scanner Sc=new Scanner(System.in);	
		
	System.out.println("Enter The NUmber:");	
	 int n =Sc.nextInt();
/***Write a Java program to display the pattern like a 
 right angle triangle with a number.****/ 
	System.out.println("triangle with number:");
     for(int i=1;i<=n;i++) {
	   for(int j=1;j<=i;j++) {
		 System.out.print(j);
	  }
       System.out.print("\n");
     }		
/*** Write a program in Java to make such a pattern like a right angle
 triangle with a  number which repeats a number in a row.***/		
   System.out.println("triangle with number in rows:");
     for(int i=1;i<=n;i++) {
  	   for(int j=1;j<=i;j++) {
  		 System.out.print(i);
  	  }
         System.out.print("\n");
       }	
		
		
		
	}

}
