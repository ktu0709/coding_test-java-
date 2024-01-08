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
		
	 while(left_index < right_index){
	 	if(snum[left_index]+snum[right_index] == snum_find_sum){
	 		//snum_find_sum는 서로 다른 두수의 합이어야한다
	 		if(snum[left_index] != snum_find_sum && snum[right_index] != snum_find_sum){
	 			count++;
	 			break;
	 			}
	 			else if(snum[left_index] == snum_find_sum){
	 				left_index++;
	 			}
	 			else if (snum[right_index] == snum_find_sum){
	 			    right_index--;
	 			}
	 	}
	 	
	 	else if(snum[left_index]+snum[right_index] < snum_find_sum){
	 		left_index++;
	 	}
	 	else{
	 		right_index--;
	 	}
	 }
	 
	}
	
	 System.out.println(count);
	 bf.close();
	}
}
