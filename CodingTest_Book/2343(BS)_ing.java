/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	static int t1 , t2 , sum;
	static int[] arr , arr_sum;
	
	private static void BinarySearch(int key , int low , int high){
		int mid;
		
		while(low <= high){
			mid = (low+high)/2;
			
			if(key == arr[mid]){
				return;
			}
			
			else if (key < arr[mid]){
				high = mid-1;
			}
			
			else{
				low = mid+1;
			}
		}
		
	}
	
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		t1 = Integer.parseInt(st.nextToken());
		t2 = Integer.parseInt(st.nextToken());
		arr = new int[t1];
		arr_sum = new int[t1];
		int max = 0;
		
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<t1;i++){
			arr[i] = Integer.parseInt(st.nextToken());
			sum += arr[i];
			System.out.print(arr[i] + " ");
		}
		
		System.out.print("\n");
		
		//누적 합
		for(int i=0;i<t1;i++){
			if(i==0){
				arr_sum[i] = arr[i];
			}
			else{
			arr_sum[i] = arr_sum[i-1] + arr[i];
			}
			System.out.print(arr_sum[i] + " ");
		}
		
		
		for(int i=0;i<t1;i++){
				if(max < arr[i]){
					max = arr[i];
				}
		}
		
		System.out.println("\n" + sum);
		System.out.println(max);
		
		
		
		
		
	}
}
