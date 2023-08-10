package org.tns.singledimensionalarray;
import java.util.Arrays;
import java.util.Scanner;
/*Program to demonstrate on array using run-time input values and 
 * to find largest element in an array*/
public class Arraymax {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total No. of Element: ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0 ;i < n;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		for(int i = 0 ;i < n;i++)
		{
			System.out.print(arr[i]);
		}
		int max = arr[0];
		for(int i = 0;i<n;i++)
		{
			if(arr[i] > max)
			{
				max = arr[i];
				
			}
		}
		System.out.println("Maximum number is: "+max);
		Arrays.sort(arr);
		System.out.println("Sorted Elements Are");
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
		sc.close();
		

	}

}
