/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	static int t1 , t2 , max , sum;
	static int[] arr;
	
	private static void BinarySearch(int low , int high){
		int mid;

		
		while(low <= high){
			
		mid = (low+high)/2;
		int sum = 0;
		int count = 0;
		
		for(int i=0;i<t1;i++){
			if(sum + arr[i] > mid){
				count++;
				sum=0;
			}
			sum = sum + arr[i];
		}
			
			if(sum!=0) count++;
			
			if(count > t2){
				low = mid +1;
			}
			else {
				high = mid -1;
			}
		}
		System.out.println(low);
	}
	
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		t1 = Integer.parseInt(st.nextToken());
		t2 = Integer.parseInt(st.nextToken());
		arr = new int[t1];
		max = 0;
		sum = 0;
		
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<t1;i++){
			arr[i] = Integer.parseInt(st.nextToken());
			sum += arr[i];
			//System.out.print(arr[i] + " ");
		}
		
		
		for(int i=0;i<t1;i++){
				if(max < arr[i]){
					max = arr[i];
				}
		}
		
		BinarySearch(max,sum);
		//System.out.println("\n" + sum);
		//System.out.println(max);
		
		
		
		
		
	}
}
