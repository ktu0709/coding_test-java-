import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
	 BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	 StringTokenizer st = new StringTokenizer(bf.readLine());
	 
	 int t1 = Integer.parseInt(st.nextToken());
	 st = new StringTokenizer(bf.readLine());
	 
	 long t2 = Long.parseLong(st.nextToken());
	 st = new StringTokenizer(bf.readLine());
	
	int[] snum  = new int[t1];
    for(int i=0;i<t1;i++){
    	snum[i] =Integer.parseInt(st.nextToken());
    }
    
    Arrays.sort(snum);
    
	 int count= 0;
	 int left_index =0;
	 int right_index = t1-1;
	 
	 while(left_index < right_index){
	 	if(snum[left_index]+snum[right_index] == t2){
	 		left_index++;
	 		right_index--;
	 		count++;
	 	}
	 	else if(snum[left_index]+snum[right_index] < t2){
	 		left_index++;
	 	}
	 	else{
	 		right_index--;
	 	}
	 }
	 System.out.println(count);
	 	 	 
	}
}
