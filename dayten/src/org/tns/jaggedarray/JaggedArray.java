package org.tns.jaggedarray;
//Anagram question
/*Given an array 'nums' of n integer where n is greater than 1 written an 
* array output such than output of ith is equal to 
* product of all the elements of nums expect nums  ()
* 
* input[1,2,4]
* output 24,12,8,6
* 
*/
import java.util.Scanner;
public class JaggedArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Declaration of jagged array
		int arr[][] = new int[3][];
		
		arr[0] = new int[2];
		arr[1] = new int[1];
		arr[2] = new int[3];
		for(int i = 0;i<3;i++)
		{
			for(int j = 0;j<arr[i].length;j++)
			{
				arr[i][j]= sc.nextInt();
				
			}
		}
		
		for(int i = 0;i<3;i++)
		{
			for(int j = 0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+" ");
				
			}
			System.out.println();
		}
		sc.close();
		
	}

}
