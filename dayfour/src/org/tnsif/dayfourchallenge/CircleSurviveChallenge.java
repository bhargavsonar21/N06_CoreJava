/*
 * There are n people standing in a circle waiting to be executed.
 * the counting out begins at some point in the circle and proceeds 
 * around a circle in a fix direction.
 * in each step a certain number of people skipped and next 
 * person is executed.
 * The elimination proceeds around the circle 
 * (which is becoming smaller and smaller as the executed people are
 * removed),until only the last person remains,who is given freedom.
 * 
 * Given the total number of person and a number k which indicates 
 * that k-1 person are skipped and the k'th person is killed in a circle 
 * the task is to choose the person in the initial person are survived*/
package org.tnsif.dayfourchallenge;

import java.util.Scanner;

public class CircleSurviveChallenge {

//	public static int challenge()
//	{
//		int n = 10;
//		int k = 3;
//		int survive = 0;
//		for(int i=2;i<=n;i++)
//		{
//			survive =(survive +k)% i;	
//		}
//		return survive + 1;
//		
		
//	}
	
	
	static int survive(int n,int k)
	{
		if(n==1)
			return 1;
		
		else
			return (survive(n-1,k)+k-1)%n+1;
	}
	
	public static void main(String[] args) {
//		System.out.println(challenge());
		Scanner s = new Scanner(System.in);
		System.out.println("ENter value of N and K");
		int n = s.nextInt();
		int k = s.nextInt();
		System.out.println(survive(n,k));
		s.close();
		
		
		

	}

}
