import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	static int N;
	static int L;
	static int add_num;

  //기본 deque는 값만 가지기 때문에 index를 가진 별도의 Node 클래스 선언
	static class Node{
	public int index;
	public int val;
	
	Node(int val,int index){
		this.val = val;
		this.index = index;
		}
	}
	
	public static void main (String[] args) throws java.lang.Exception
	{
	 BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	 BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
	 StringTokenizer st = new StringTokenizer(bf.readLine());
	 
	 N = Integer.parseInt(st.nextToken());
	 L = Integer.parseInt(st.nextToken());
	 Deque<Node> arr = new ArrayDeque<>();

	 st = new StringTokenizer(bf.readLine());
	 for(int i=0;i<N;i++){
        add_num = Integer.parseInt(st.nextToken()); //다음으로 입력될 값
    
    //덱에 마지막 값이 add_num보다 클 경우
		while(!arr.isEmpty() && (arr.getLast().val > add_num)){ 
			arr.removeLast();
		}
	 	arr.addLast(new Node(add_num,i));

    //i-L+1 (0부터 시작하기 때문에 +1은 제외)
	 	if(arr.getFirst().index <=i-L){
	 		arr.removeFirst();
	 	}
	 	//System.out.println(arr.val);
	 	bw.write(arr.getFirst().val+" ");
	 	
	 }
	 bw.flush();
	 bf.close();
	 
	}
}
