/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	private static int[] arr;
	private static int t1,t2;
	
	
	private static void binarysearch(int key , int low , int high){
	int mid;
	
	while(low <= high){
	  mid=(low+high)/2;

	  if(key == arr[mid]){
	  		System.out.println(1);
	  		return;
	  }
	  else if(key < arr[mid]){
	  		high = mid-1;
	  }
	  else{
	  		low = mid+1;
	  }
	}
	System.out.println(0);
	return;
	
	}
	
	
	
	
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		t1 = Integer.parseInt(st.nextToken());
		arr = new int[t1];
		
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<t1;i++){
			arr[i] = Integer.parseInt(st.nextToken()); 
		}
		Arrays.sort(arr);
		
		
		st = new StringTokenizer(br.readLine());
		t2 = Integer.parseInt(st.nextToken());
	
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<t2;i++){
			int findnum = Integer.parseInt(st.nextToken());
			binarysearch(findnum,0,arr.length-1);
		}
		
		
		
		
	
		
	}
}
