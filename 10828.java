import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		Stack<Integer> stack = new Stack<>();
		int t1 = Integer.parseInt(st.nextToken());
		

		for(int i=0;i<t1;i++){
		st = new StringTokenizer(br.readLine());
		String cmd = st.nextToken();
	

		if(cmd.equals("push")){
		int t2 = Integer.parseInt(st.nextToken());	
		stack.push(t2);
		}
		else if(cmd.equals("top")){
			if(!stack.isEmpty()) System.out.println(stack.peek());
			else System.out.println(-1);
		}
	    else if(cmd.equals("size")){
					System.out.println(stack.size());
	    }
		else if(cmd.equals("empty")){
			if(!stack.isEmpty()) System.out.println(0);
			else System.out.println(1);
		}
		else{
			if(!stack.isEmpty()){ System.out.println(stack.peek()); stack.pop();}
			else System.out.println(-1);
		}
		
		}

	}
}
