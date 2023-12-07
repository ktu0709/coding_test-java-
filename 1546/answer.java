import java.util.Scanner;
import java.io.FileInputStream;

public class Main {
	public static void main(String[] args) {
	
    Scanner sc = new Scanner(System.in);
	int T; 
	T=sc.nextInt(); //첫번째 줄(숫자의 개수) 
        
     int[] snum = new int[T];
	    
	    for(int i=0;i<snum.length;i++){
	    	 snum[i] = sc.nextInt();
		      } // 두번째 줄
        
    long max= 0; //최댓값
    long sum= 0; //합계

    for(int i=0;i<snum.length;i++){
      sum += snum[i];
      if(max < snum[i]){
          max = snum[i];
      }
    }
    System.out.println(sum*100.0/max/T);
    }                   
}
