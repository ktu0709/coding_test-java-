/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static int partition(int[] arr , int start , int end){
		int m = (end+start) / 2;
		int pivot = arr[m];
		
		while(start <= end){
			
			while(arr[start] < pivot){
					start++;
			}
			
			while(arr[end]> pivot){
				end--;
			}
			
			if(start <= end){
				int swap = arr[start];
				arr[start]= arr[end];
				arr[end] = swap;
				start++;
				end--;
			}
			
		}
		
		return start;
	}
	
	public static void QuickSort(int[] arr , int start , int end , int find_index){
		
		if(start < end)	{
			
		int pivot = partition(arr,start,end);
		
		if(pivot == find_index){
			return;
		}
		else if(find_index < pivot){
		QuickSort(arr,start,pivot-1,find_index);
		}
		else QuickSort(arr,pivot+1,end,find_index);
		
		}
	}
	
	
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int t1 = Integer.parseInt(st.nextToken());
		int t2 = Integer.parseInt(st.nextToken());
		int[] arr = new int[t1];
		
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<t1;i++){
				arr[i]=Integer.parseInt(st.nextToken());
		}
		
		QuickSort(arr,0,t1-1,t2-1);
		
		System.out.println(arr[t2-1]);
	}
}
