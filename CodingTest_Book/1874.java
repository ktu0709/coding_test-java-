/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
	 BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	 StringTokenizer st = new StringTokenizer(bf.readLine());
	 StringBuffer buf = new StringBuffer();
	 Stack<Integer> stack = new Stack<>();
	 int num = 1;
	 boolean res = true;
	 int t1 = Integer.parseInt(st.nextToken());
	 int[] arr = new int[t1];
	 
	 for(int i=0;i<t1;i++){
	 	st = new StringTokenizer(bf.readLine());
	 	arr[i] =Integer.parseInt(st.nextToken());
	 }
	 
	 for(int i=0;i<arr.length;i++){
	 	int su = arr[i];
	 	if(su >= num){
	 		while(su >= num){
	 			stack.push(num++);
	 			buf.append("+\n");
	 		}
	 		stack.pop();
	 		buf.append("-\n");
	 	}
	 	else{
	 		int n = stack.pop();
	 		
	 		if(n> su){
	 			System.out.println("NO");
	 			res = false;
	 			break;
	 		}
	 		else{
	 			buf.append("-\n");
	 		}
	 	}
	 }
		if(res) System.out.println(buf.toString());
	}
}
