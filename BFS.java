import java.util.*;

public class Main{
  public static boolean[] visited = new boolean[9];
  public static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();

  public static void bfs(int start){
  Queue<Integer> q = new LinkedList<>();
  q.offer(start);
  //현재노드 방문처리
  vistied[start] = true;
  
  while(!q.isEmpty()){
  //큐에서 원소를 하나 뽑아 출력
  int x= q.poll();
  System.out.println(x+" ");

  //해당 원소와 연결된, 아직 방문하지 않은 원소들을 큐에 삽입
  for(int i=0;i<graph.get(x).size();i++){
  int y=graph.get(x).get(i);
  if(!visited[y]){
      q.offer(y);
      visited[y]=true;
      }
    }
  }

  }
}
