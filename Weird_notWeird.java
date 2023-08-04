package Adarsh;

import java.util.Scanner;

public class Weird_notWeird {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no.");
		int n = sc.nextInt();
		
		
		if(n % 2 == 1) {
			System.out.println("Werid"); // If n is odd, print Weird.
		}else if(n >= 2 && n <=5) {
			System.out.println("Not Werid"); // If n is even and in the inclusive range of 2 to 5, print Not Weird.
		}else if(n >= 6 && n <=20) {
			System.out.println("Werid"); // If n is even and in the inclusive range of 6 to 20, print Weird.
		}else {
			System.out.println("Not Werid"); // If n is even and greater than 20, print Not Weird.
		}
	}

}


