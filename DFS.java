import java.util.*;

public class Main{
  public static boolean[] visited = new boolean[9];
  public static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();

  public static void dfs(int x){
    visited[x] = true;
    System.out.println(x + " ");  
    for(int i=0;i<graph.get(x).size();i++){
      int y= graph.get(x).get(i);
      if(!visited[y]) dfs(y);      
    }
  }

  public static void main(String[] args){
  /*
   그래프 연결된 내용 생략
    */
    dfs(1)
  }

}
