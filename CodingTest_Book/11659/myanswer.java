//Time Error
import java.util.Scanner;
import java.io.FileInputStream;

public class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
	int t1,t2,a1,a2,a1_sum,a2_sum = 0; 
	t1=sc.nextInt(); //숫자 갯수
	t2=sc.nextInt(); //범위 갯수
	
        
    int[] snum = new int[t1];
    
	for(int i=0;i<snum.length;i++){
	    	 snum[i] = sc.nextInt();
		      } // 두번째 줄
	/*	      
	for(int i=0;i<snum.length;i++){
	    	 System.out.println(snum[i]);
		      } // 두번째 줄
	*/
	
	// 범위 받기
	for(int i=0;i<t2;i++){
	 a1 = sc.nextInt();
	 a2 = sc.nextInt();
	 a1_sum=0;
	 a2_sum=0;
	 // s[a1] - s[a2-1] , s[n]은 0번째부터 n번째까지 수의 합
	 for(int j=0;j<a2;j++){
	 	a2_sum += snum[j];
	 }
	 for(int k=0;k<a1-1;k++){
	 	a1_sum += snum[k];
	 }
	 //System.out.println("a2: "+a2+" : "+a2_sum);
	 //System.out.println("a1: "+a1+" : "+a1_sum);
	 
	 System.out.println(a2_sum - a1_sum);
	} 
    
    }
}
