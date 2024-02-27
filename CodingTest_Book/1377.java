/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	
	 static class I_Arr implements Comparable<I_Arr> {
		 public int idx;
		 public int num;
		 
		 public I_Arr(int idx , int num){
		  super();
		  this.idx = idx;
		  this.num = num;
		 }
		 
		 @Override
		 public int compareTo(I_Arr o){
		 	return this.num - o.num;
		 }
		
		
	}

	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int t1 = Integer.parseInt(st.nextToken());
		I_Arr[] arr = new I_Arr[t1];
		
		for(int i=0;i<t1;i++){
		st = new StringTokenizer(br.readLine());
		arr[i] = new I_Arr(i,Integer.parseInt(st.nextToken()));
		}
		
		Arrays.sort(arr);
        int max = 0;
        for(int i=0;i<t1;i++){
        	if(max < arr[i].idx-i){
        		max=arr[i].idx-i;
        	}
        }
        bw.write(max+1+"\n");
		
		bw.flush();
		bw.close();
	}
}
