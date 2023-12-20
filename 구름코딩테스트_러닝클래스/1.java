/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		//String input = br.readLine();
		//System.out.println("Hello Goorm! Your input is " + input);
		int t1 = Integer.parseInt(st.nextToken());
		int t2 = Integer.parseInt(st.nextToken());
		
		double[] box = new double[t1+1];
		
		for(int i=0;i<t2;i++){
			st = new StringTokenizer(br.readLine());
			int check1 = Integer.parseInt(st.nextToken()); // 상자번호
			int check2 = Integer.parseInt(st.nextToken()); // 명령어 순번
		 	double check3 = Double.parseDouble(st.nextToken()); // 공 개수
			
			//System.out.println("\n"+"입력값 : " + check1 + " : " +check2+" : "+check3);
			
			if(check2 == 1){
				box[check1-1] += check3;
			}
			else if(check2 == 2){
				if(box[check1-1] < check3){
		
				}
				else {box[check1-1] -= check3;}				
			}			
		}
		
		for(int i=0;i<t1;i++){
			System.out.println(box[i]);
		}
	}
}
