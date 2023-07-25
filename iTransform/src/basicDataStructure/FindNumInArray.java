package basicDataStructure;

import java.util.Scanner;

public class FindNumInArray {

	public static void main(String[] args) {
		int arr[] = {5, 12, 14, 6, 78, 19, 1, 23, 26, 35, 37, 7, 52, 86, 47};
		System.out.println("enter a number to be seacrhed in the array");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int flag=0;
		
		for(int a: arr) {
			if(a==num) {
				flag++;
			}
		}
		if(flag>0) {
			System.out.println("number is present");
		}
		else
			System.out.println("number is not present");
		}

}
