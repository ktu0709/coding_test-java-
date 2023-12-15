import java.util.Scanner;
import java.io.FileInputStream;

public class Main {
	public static void main(String[] args) {
	
    Scanner sc = new Scanner(System.in);
	int T; 
	T=sc.nextInt(); //첫번째 줄(숫자의 개수) 
        
    String Nnum = sc.next(); //두번째 줄 (N개의 숫자)
    char[] Snum = Nnum.toCharArray();
    int sum = 0;
    for(int i=0;i<Snum.length;i++){
        sum += (Snum[i]-'0'); //String 이면 parseInt를 사용하면 되지만 char는  -'0' 를 붙혀 연산해야함
    }
    System.out.println(sum);                   
	}
}
