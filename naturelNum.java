/**
 * 
 */
package ConditionEx;

import java.util.Scanner;

public class naturelNum {

	public static void main(String[] args) {
	Scanner Sc =new Scanner(System.in);
 System.out.println("Enter the number:");
   int n1 = Sc.nextInt();
   int sum =0;
   for(int i=1;i<=n1;i++) {
	   sum+=i;  
   } System.out.println("Sum value    : "+sum);
		
	double ave=sum/n1;
	System.out.println("Average value: "+ave);

	int cube=0;
   for( int j=1;j<=n1*n1;j++) {
	   cube=j*n1;
   }System.out.println("Cube value   : "+cube);
		
		
		
		
		
	
 }
}
