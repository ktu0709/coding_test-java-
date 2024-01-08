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
	 
	long[] snum  = new long[t1];
    for(int i=0;i<t1;i++){
    	snum[i] =Long.parseLong(st.nextToken());
    }
    
     Arrays.sort(snum);
    
	 int count= 0;
	 int left_index =0;
	 int right_index = t1-1;
	 long snum_find_sum = 0;

	for(int i=0;i<t1;i++){
		snum_find_sum = snum[i];
		left_index = 0;
		right_index=t1-1;
		
	 while(true){
	 if(left_index ==i) left_index++;
     else if(right_index==i) right_index--;
     
     if (left_index >= right_index) break;
     
     if(snum[left_index] + snum[right_index] > snum[i]) right_index--;
     else if(snum[left_index] + snum[right_index] < snum[i]) left_index++;
	 else{
	 	count++;
	 	break;
	 }	 
	 }	 
	}
	
	 System.out.println(count);
	 bf.close();
	}
}
