package defultPackage;

import java.util.Scanner;

public class NatualNumber {

	public static void main(String[] args) {

		int num, count = 1, total = 0;

	     /*  while(count <= num)
	       {
	           total = total + count;
	           count++;
	           System.out.println(" "+total);
	       } */
			System.out.println("Enter the value of num: ");
			Scanner sc = new Scanner(System.in);
			num = sc.nextInt();
			sc.close();
				
			for(count = 1; count <= num; count++){
	           total = total + count;
	       }

	       System.out.println("Sum of first 10 natural numbers is: "+total);

	}

}
