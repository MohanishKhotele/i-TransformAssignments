package basicDataStructure;

import java.util.Scanner;

public class SimpleAndCompoundInterest {

	public static void main(String[] args) {
		double p, rate, n, sim,com;
		Scanner obj=new Scanner(System. in);
		
		System.out.println("Enter amount:");		
		p=obj.nextDouble();
		
		System. out. println("Enter the No.of years:");
		n=obj.nextDouble();
		
		System.out. println("Enter the Rate of interest");
		rate=obj.nextDouble();
		
		sim=(p * n * rate)/100;// Formula for simple interest
		com=p * Math.pow(1.0+rate/100.0,n) - p;// Formula for compound interest
		System.out.println("Simple Interest="+sim );
		System.out. println("Compound Interest="+com);
	}

}
