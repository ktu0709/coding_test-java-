import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int t1 = Integer.parseInt(st.nextToken());
		int[] arr = new int[t1];
		
		for(int i=0;i<t1;i++){
		st = new StringTokenizer(br.readLine());
		arr[i] = Integer.parseInt(st.nextToken());
		}
		
		
		for(int i=0;i<t1-1;i++){
			for(int j=0;j<t1-1-i;j++){
				if(arr[j]>arr[j+1]){
					int swap = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = swap;
				}
			}
		}
		
		for(int i=0; i<t1;i++){
			System.out.println(arr[i]);
		}
		
	}
}
