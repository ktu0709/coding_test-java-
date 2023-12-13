import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws java.lang.Exception {    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer st;
	StringBuffer sb = new StringBuffer();
	String str;

    while((str=br.readLine()) != null){
    	
    	st = new StringTokenizer(str," ");
    	int i = Integer.parseInt(st.nextToken());
	 	int j = Integer.parseInt(st.nextToken());
	 	
	 	sb.append((i+j)).append("\n");
     }
	System.out.println(sb);    
        
 }
}
