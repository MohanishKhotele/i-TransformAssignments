package basicDataStructure;

import java.util.Scanner;

public class ThreeSubjects {

	public static void main(String[] args) {
		double sub1, sub2, sub3;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the marks in subject 1");
		sub1 = sc.nextDouble();
		
		System.out.println("enter the marks in subject 2");
		sub2 = sc.nextDouble();
		
		System.out.println("enter the marks in subject 3");
		sub3 = sc.nextDouble();
		
		if(sub1>60 && sub2>60 && sub3>60) {
			System.out.println("pass");
		}
		else if((sub1>60 && sub2>60) || (sub2>60 && sub3>60) || (sub1>60 && sub3>60)) {
			System.out.println("promoted");
		}
		else if(sub1>60 || sub2>60 || sub3>60 || (sub1<60 && sub2<60 && sub3<60)) {
			System.out.println("failed");
		}

	}

}
