import java.util.*;
import java.lang.*;
import java.io.*;

    public class Main {
	public static void main(String[] args) throws java.lang.Exception {
	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	 StringTokenizer st = new StringTokenizer(br.readLine());
	 
	 int array_size = Integer.parseInt(st.nextToken());
	 int sum_count = Integer.parseInt(st.nextToken());
	 
	 //D[i][j] 누적 합
        int[][] D = new int[array_size+1][array_size+1];
        for(int i=1; i<array_size+1; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=1; j<array_size+1; j++) {
                D[i][j] = D[i][j-1] + D[i-1][j] - D[i-1][j-1] + Integer.parseInt(st.nextToken());
            }
        }
	 
	 //좌표 x1 , y1, x2, y2 에 대한 답을 구간 합	 
	 	 for(int c=0;c<sum_count;c++){
	 	 	st = new StringTokenizer(br.readLine());
	 	 	int x1 = Integer.parseInt(st.nextToken());
	 	 	int y1 = Integer.parseInt(st.nextToken());
	 	 	int x2 = Integer.parseInt(st.nextToken());
	 	 	int y2 = Integer.parseInt(st.nextToken());
	 	 	
	 	 	int res = D[x2][y2] - D[x1 - 1][y2] - D[x2][y1 - 1]+D[x1 - 1][y1 - 1];
	 	 	System.out.println(res);
	 	 }
        
    }
 }
