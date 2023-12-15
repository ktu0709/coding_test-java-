import java.util.*;
import java.lang.*;
import java.io.*;

import java.util.Scanner;
import java.io.FileInputStream;

public class Main {
	public static void main(String[] args) throws java.lang.Exception {
     BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	 StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
	 
	 int suno = Integer.parseInt(stringTokenizer.nextToken());
	 int quizno = Integer.parseInt(stringTokenizer.nextToken());
	 long[] nnum = new long[suno+1];
	 stringTokenizer = new StringTokenizer(bufferedReader.readLine());
	 
	 // i번째까지 배열의 구간 합
	 for(int i = 1;i<=suno;i++){
	 	nnum[i] = nnum[i-1] + Integer.parseInt(stringTokenizer.nextToken());
	 	//System.out.println(i+": "+nnum[i] +" : " +nnum[i-1]);
	 }

         //1차원 구간합 공식 : S[j]-S[i-1]
	 for(int q=0;q<quizno;q++){
	 	stringTokenizer = new StringTokenizer(bufferedReader.readLine());
	 	int i = Integer.parseInt(stringTokenizer.nextToken());
	 	int j = Integer.parseInt(stringTokenizer.nextToken());
	 	System.out.println(nnum[j] - nnum[i-1]);
	 }
    
    }
}
