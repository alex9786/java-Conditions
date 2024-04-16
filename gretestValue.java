/**
 * 
 */
package ConditionEx;

import java.util.Scanner;

public class gretestValue {

	public static void main(String[] args) {
		
 Scanner Sc=new Scanner (System.in);		
	System.out.println("ENTER THE NUMBERS:");	
	int num1=Sc.nextInt();
	int num2=Sc.nextInt();
	int num3=Sc.nextInt();
	
	if(num1>num2) {
	System.out.println("gretest value is num1");
	}else if(num2>num3) {
	System.out.println("gretest value is num2");	
	}else {
	System.out.println("gretest value is num3");	
	}
	
/***Write a Java program that reads a floating-point number and prints "zero"
 if the number is zero. Write a Java program that reads a floating-point number
 and prints "zero" if the number is zero or "large" if it exceeds 1,000,000.***/
	System.out.println("ENTER THE NUMBERS:");	
	int x=Sc.nextInt();
	if(x>0) {
		System.out.println("positive number");
	}else if(x<0) {
	 System.out.println("negative number");	
	}else {
	 System.out.println("the number is zero");	
	}
	
	if(Math.abs(x)<1) {
		System.out.println("smallest number");
	}else if( Math.abs(x)<1000000) {
	 System.out.println("largest number");	
	}else {
	 System.out.println("the number is zero");	
	}
		
 }
}
