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
		int[] snum = new int[t1+1];
		int sum = 0;
		
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<t1;i++){
			arr[i]=Integer.parseInt(st.nextToken());
		}

		Arrays.sort(arr);
		
		//배열 누적 합
		for(int i = 1;i<=t1;i++){
	 	snum[i] = snum[i-1] + arr[i-1];
	 	//System.out.println(i+": "+snum[i] +" : " +snum[i-1]);
	 	sum += snum[i];
	 }
	
	System.out.println(sum);
		
		
		
	}
}
