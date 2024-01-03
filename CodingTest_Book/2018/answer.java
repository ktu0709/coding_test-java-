import java.util.*;
import java.io.*;


class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
	 BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	 StringTokenizer st = new StringTokenizer(bf.readLine());
	 
	 int t1 = Integer.parseInt(st.nextToken());
	 int count = 1;
	 int sum = 1;
	 int start_index = 1;
	 int end_index = 1;
	 
	 while(end_index != t1){
	 	if(sum == t1){  
	 		count++;
	 		end_index++;
	 		sum+=end_index;
	 		
	 	}
	 	else if(sum < t1){  
	 	end_index++;
	 	sum += end_index;
	 	}
	 	else{ //합이 맞추고자 하는 값보다 클 경우
	 		sum -= start_index;
	 		start_index++;
	 	}
	 }
	 System.out.println(count);
	 
	}
}
