package array_practice;

import java.util.Scanner;

public class Question_10_Practice {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=sc.nextInt();
		System.out.println("Enter the string elements");
		int[] arr=new int[n];
		for(int i=0; i<n ;i++)
		{
			arr[i]=sc1.nextInt();
		}
		boolean palindrome=true;
		for(int i=0; i<n/2; i++)
		{
			if(arr[i]==arr[n-i-1])
			{
				palindrome=true;
			}
			else
			{
				palindrome=false;
				break;
			}
		}
		
		if(palindrome)
		{
			System.out.println("The above array is a palindrome");
		}
		else
		{
			System.out.println("The above array is not a palindrome");
		}
	
	
	}


}
