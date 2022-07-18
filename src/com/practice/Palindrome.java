package com.practice;

import java.util.Scanner;

public class Palindrome {
	
	void getPalindrome( int a) {
		int number=a,t1=a,rev=0,rem=0;
		while(t1!=0) {
			rem=t1%10;
			rev=rev*10+rem;
			t1=t1/10;
		}if(rev==number) {
			System.out.println(number+" it is palindrome.");
		}else {
			System.out.println(number+" its not a palindrome.");
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int x = Integer.parseInt(scan.nextLine());
		Palindrome palindrome = new Palindrome();
		palindrome.getPalindrome(x);
	}

}
