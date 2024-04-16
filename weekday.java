/**
 * 
 */
package ConditionEx;

import java.util.Scanner;

public class weekday {

	public static void main(String[] args) {
		
	Scanner Sc =new Scanner(System.in);	
		
	System.out.println("Enter the Number:");	
	int num = Sc.nextInt();
	 switch(num) {
	
	 case 1:{
		 System.out.println("Monday");
	 }break;
	 case 2:{
		 System.out.println("Tuesday");
	 }break;
	 case 3:{
		 System.out.println("Wednesday");
	 }break;
	 case 4:{
		 System.out.println("Thusday");
	 }break;
	 case 5:{
		 System.out.println("Friday");
	 }break;
	 case 6:{
		 System.out.println("Saturday");
	 }break;
	 case 7:{
		 System.out.println("Sunday");
	 }break;
	 default :{
		System.out.println("Invalid number"); 
	 }
	 }
/****Write a Java program that reads two floating-point numbers
and tests whether they are the same up to three decimal places.**/
	 System.out.println("Enter the Number:");	
	 double num1 = Sc.nextDouble();
	 double num2 = Sc.nextDouble();	
		
	if(num1==num2) {
	System.out.println("the numbers are same");
	}else  {
	System.out.println("the number is different");	
	}
		
		

 }
}
