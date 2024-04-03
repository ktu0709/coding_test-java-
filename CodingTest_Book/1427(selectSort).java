/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());		

		String t1 = st.nextToken();
		int[] arr = new int[t1.length()];
		int max = 0;
		
		for(int i=0;i<t1.length();i++){
			arr[i]=t1.charAt(i) - '0';
		}
		
		for(int i=0;i<arr.length-1;i++){
				max= i;
			for(int j=i+1;j<arr.length;j++){
				if(arr[j] > arr[max]){
					max= j;
				}
				if (arr[i] < arr[max]){
				int temp = arr[i];
				arr[i] = arr[max];
				arr[max] = temp;
				}
				
			}
		}
		
		for(int i=0;i<t1.length();i++){
			System.out.print(arr[i]);
		}

}

}
