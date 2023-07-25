package basicDataStructure;

import java.util.Scanner;

public class IncomeTax {

	public static void main(String[] args) {
		
		System.out.println("Enter your CTC");
		Scanner sc = new Scanner(System.in);
		double income = sc.nextDouble();
		
		if(income<=180000) {
			System.out.println("nil income tax");
		}
		else if(income>=180000 && income<=300000) {
			System.out.println("tax ="+(income * 0.1));
		}
		else if(income>=30001 && income<=500000) {
			System.out.println("tax ="+(income * 0.2));
		}
		else if(income>=500001 && income<=1000000) {
			System.out.println("tax ="+(income * 0.2));
		}
			
	}

}
