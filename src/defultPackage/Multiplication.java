package defultPackage;

import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		 
		double num3 = sc.nextDouble();
		double num4 = sc.nextDouble();
		
		sc.close();
		
		double product = num1*num2;
		System.out.println("Output: "+product);
				

	}

}
