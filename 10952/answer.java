//Buffer 객체 참조용 문제
import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws java.lang.Exception {
  	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer st;
	StringBuffer sb = new StringBuffer();

    while(true){
    	st = new StringTokenizer(br.readLine());
    	int i = Integer.parseInt(st.nextToken());
	 	int j = Integer.parseInt(st.nextToken());
	 	
	 	if(i == 0 && j==0){
	 		break;
	 	}
	 	sb.append((i+j)).append("\n");
    }
	System.out.println(sb);

 }
}
