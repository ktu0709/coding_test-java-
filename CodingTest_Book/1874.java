/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    StringBuffer sb = new StringBuffer();
    Stack<Integer> stack = new Stack<>();
    
    int num = 1;
    int t1 = Integer.parseInt(st.nextToken());
    int[] arr = new int[t1];
    boolean res = true;
    for(int i=0;i<t1;i++){
    	st= new StringTokenizer(br.readLine());
    	arr[i] = Integer.parseInt(st.nextToken());
    }
    
    for(int i=0;i<t1;i++){
    	
    	if(num <= arr[i]){
    		
    	while(num <= arr[i]){
    		stack.push(num++);
    		sb.append("+\n");
    	}
    	 stack.pop();
    	 sb.append("-\n");
    	}
    	else{
    		int n = stack.pop();

    		if(n> arr[i]){
    			System.out.println("NO");
    			res = false;
    			break;
    		}
    		
    		else{
    			sb.append("-\n");
    		}
    		
    		
    	
    	}
    
     if(res) System.out.println(sb.toString());
    }
    
	}
}
