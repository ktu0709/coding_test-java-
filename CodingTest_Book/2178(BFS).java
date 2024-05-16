import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	private static int t1,t2;
	private static int[][] graph;
	private static boolean[][] visited;
	private static int[] dx = {0, 0, -1, 1}; // 상하좌우 - x좌표
    private static int[] dy = {-1, 1, 0, 0}; // 상하좌우 - y좌표

	private static int bfs(int x,int y){
		Queue<int[]> q = new LinkedList<>();
		q.add(new int[]{x,y});
		visited[x][y] = true;
		int[][] distance = new int[t1][t2];
		distance[x][y]=1;
		
		while(!q.isEmpty()){
			int[] current = q.poll();
            int currx = current[0];
            int curry = current[1];
            
			for(int i=0;i<4;i++){
				int nx = currx+dx[i];
				int ny = curry+dy[i];
				
				if(nx >= 0 && ny >= 0 && nx < t1 && ny < t2 && !visited[nx][ny] && graph[nx][ny] == 1 ){
					q.add(new int[]{nx,ny});
					visited[nx][ny] = true;
					distance[nx][ny] = distance[currx][curry]+1;
				}
			}
		}
		
		return distance[t1-1][t2-1];
	}
	
	
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		t1 = Integer.parseInt(st.nextToken());
		t2 = Integer.parseInt(st.nextToken());
		int cnt = 0;
		
		graph = new int[t1][t2];
		visited = new boolean[t1][t2];
		
		for(int i=0;i<t1;i++){
			//st = new StringTokenizer(br.readLine());
			String line = br.readLine();
			for(int j=0;j<t2;j++){
				//graph[i][j] = Integer.parseInt(st.nextToken());
				graph[i][j] = line.charAt(j) - '0';
			}
		}
		
		
		/*
		//출력
		for(int i=0;i<t1;i++){
			for(int j=0;j<t2;j++){
				System.out.print(graph[i][j]+ " ");
			}
			System.out.print("\n");
		}
		*/
		
		
		cnt = bfs(0,0);
		System.out.println(cnt);

	}
}
