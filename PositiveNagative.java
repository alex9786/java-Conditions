/**
 * 
 */
package ConditionEx;

import java.util.Scanner;

public class PositiveNagative {

	public static void main(String[] args) {
		
/**** Write a Java program to get a number from the user 
	 and print whether it is positive or negative.*****/	
	 
		Scanner Sc = new Scanner(System.in);
	System.out.println("ENTER THE NUMBER:");
    int num=Sc.nextInt();
    if(num>0) {
    	System.out.println("THE NMBER IS POSITIVE");
    }else if(num<0) {
    	System.out.println("THE NUMBER IS NEGATIVE");
    }else {
    	System.out.println("THE NUMBER IS ZERO");
    }
		
/*****Write a Java program to solve quadratic
 * equation (use if, else if and else).**/
    System.out.println("ENTER THE NUMBERS:");
    double a =Sc.nextDouble();
    double b =Sc.nextDouble();
    double c =Sc.nextDouble();
   double d=b*b-4*a*c;
	if(d>0) {
		double r1=(-b+Math.sqrt(d))/(2*a);
		double r2=(-b-Math.sqrt(d))/(2*a);
		System.out.println("The roots :"+r1+" "+r2);
	}else if(d==0) {
		double r=-b/(2*a);
		System.out.println(r);
	}else {
		System.out.println("the number don't have root");
	}
		
		
		
		
		
 }
}
