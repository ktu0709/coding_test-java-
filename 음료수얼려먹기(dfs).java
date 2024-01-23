/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	static int t1,t2;
	static int[][] graph;
	
		public static boolean dfs(int x,int y) {
		if(x<= -1 || x >= t1 || y <= -1  || y >= t2) {
			return false;
		}
		if(graph[x][y] == 0) {
		  graph[x][y] = 1;
		  dfs(x,y+1); //상
		  dfs(x,y-1); //하
		  dfs(x-1,y);//좌
		  dfs(x+1,y);//우
		  return true;
		}
		return false;
	}
	
	public static void main (String[] args) throws java.lang.Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		t1 = Integer.parseInt(st.nextToken());
	    t2 = Integer.parseInt(st.nextToken());
	    
	    int count = 0;
	    boolean res = true;
	    graph = new int[t1][t2];
	    
	    for(int i=0;i<t1;i++) {
	    	st = new StringTokenizer(br.readLine());
	    	for(int j=0;j<t2;j++) {
	    		graph[i][j] = Integer.parseInt(st.nextToken());
	    	}	    	
	    }
	    
	    
	    for(int i=0;i<t1;i++) {	    	
	    	for(int j=0;j<t2;j++) {
	    		res=dfs(i,j);
	    		if(res) count++;
	    	}	    	
	    }
	    
	    System.out.println(count);
	}
}
