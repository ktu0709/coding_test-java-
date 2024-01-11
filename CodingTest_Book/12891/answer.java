import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	static int checkarr[]; //비밀번호 체크 배열
	static int myarr[]; //현재상태배열
	static int checksecret;
	
	public static void main (String[] args) throws java.lang.Exception
	{
	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	 StringTokenizer st = new StringTokenizer(bf.readLine());
	 
	 int t1 = Integer.parseInt(st.nextToken());
	 int t2 = Integer.parseInt(st.nextToken());
	 checksecret = 0;
	 int count =0;
	 char[] arr = bf.readLine().toCharArray(); //S 배열
	 checkarr = new int[4];
	 myarr = new int[4];
	 
	 st = new StringTokenizer(bf.readLine());
     for(int i =0;i<4;i++){
     	checkarr[i] = Integer.parseInt(st.nextToken());
     	if(checkarr[i] == 0) checksecret++;
     }
     
	for(int i=0;i<t2;i++){
		Add(arr[i]);
	}
	
	if(checksecret ==4){
		count++;
	}
	
	for(int i=t2;i<t1;i++){
		int j= i-t2;
		Add(arr[i]);
		Remove(arr[j]);
		if(checksecret ==4) count++;
	}
	
	 System.out.println(count);
	 bf.close();
	}
	
	private static void Add(char c){
		switch (c){
			case 'A':
			myarr[0]++;
			if(myarr[0] == checkarr[0]) checksecret++; break;
			case 'C':
			myarr[1]++;
			if(myarr[1] == checkarr[1]) checksecret++; break;
			case 'G':
			myarr[2]++;
			if(myarr[2] == checkarr[2]) checksecret++; break;
			case 'T':
			myarr[3]++;
			if(myarr[3] == checkarr[3]) checksecret++; break;
		}
	}
	
		private static void Remove(char c){
		switch (c){
			case 'A':
			if(myarr[0] == checkarr[0]) checksecret--; myarr[0]--; break;
			case 'C':
			if(myarr[1] == checkarr[1]) checksecret--; myarr[1]--; break;
			case 'G':
			if(myarr[2] == checkarr[2]) checksecret--; myarr[2]--; break;
			case 'T':
			if(myarr[3] == checkarr[3]) checksecret--; myarr[3]--; break;	
		}
		}
	
}
