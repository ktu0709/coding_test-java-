/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{	
	static class node{
		int to;
		int cost;
		
		private node(int to,int cost){
			this.to = to;
			this.cost = cost;
		}
		
	}
	
	private static void bfs(int n){
	Queue<Integer> q = new LinkedList<>();
	q.add(n);
	visited[n] = true;
	
	while(!q.isEmpty()){
		int x = q.poll();
		
		for (node Node : graph[x]){
			int chk_to = Node.to;
			int chk_cost = Node.cost;
			
			if(!visited[chk_to]){
				visited[chk_to] = true;
				q.offer(chk_to);
				distance[chk_to] = distance[x] + chk_cost;
				
			}
		}
	}
	
	}
	
	
	private static int t1,t2,t3;
	private static ArrayList<node>[] graph;
	private static boolean[] visited;
	private static int[] distance;
	
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		t1 = Integer.parseInt(st.nextToken());
        
		graph = new ArrayList[t1+1];
		visited = new boolean[t1+1];
		distance = new int[t1+1];
		
		for(int i=1;i<=t1;i++){
			graph[i] = new ArrayList<node>();
		}
		
		for(int i=1;i<=t1;i++){
			st = new StringTokenizer(br.readLine());
			int vertex = Integer.parseInt(st.nextToken());
			while(true){
				int input_to = Integer.parseInt(st.nextToken());
				if(input_to == -1){
					break;
				}
				int input_cost = Integer.parseInt(st.nextToken());
				graph[vertex].add(new node(input_to,input_cost));
			}
		}
		
		/*
		//출력
		 for (int i = 1; i <= t1; i++) {
            System.out.print("Vertex " + i + ":");
            for (node n : graph[i]) {
                System.out.print(" -> (" + n.to + ", " + n.cost + ")");
            }
            System.out.println();
        }
        */
        
        
        bfs(1);

		/*
        for(int i=1 ;i<= t1 ; i++){
        	System.out.print(distance[i] + " ");
        }
        */
        

		
		  int max = distance[0];        
		  int maxIndex = 0;
		  for (int i = 0; i < distance.length; i++) { 
		  	if (distance[i] > max) {  
		  		max = distance[i];               
		  		maxIndex = i;          
		  		}   
		  	}
		  	
		//System.out.println(maxIndex);
		 
		visited = new boolean[t1+1];
		distance = new int[t1+1];
		 
		bfs(maxIndex);
		
		/*
		for(int i=1 ;i<= t1 ; i++){
        	System.out.print(distance[i] + " ");
        }
        */

        Arrays.sort(distance);
        System.out.println(distance[t1]);
		
		
	}
}
