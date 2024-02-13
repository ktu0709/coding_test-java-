import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	 StringTokenizer st = new StringTokenizer(br.readLine());
	 BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	 Deque<Integer> stack = new ArrayDeque<>();
	 
	 int t1 = Integer.parseInt(st.nextToken());
	 
	 for(int i=1;i<=t1;i++){
	 	stack.addFirst(i);
	 	//System.out.println(stack);
	 }

	 while(stack.size() != 1){
	 	//1
		stack.removeLast();

		//2
		int second_num = stack.removeLast();
		//System.out.println(second_num);
	 	stack.addFirst(second_num);
	 	
	 	
	 }
	 System.out.println(stack.getFirst());
	
	}
}
