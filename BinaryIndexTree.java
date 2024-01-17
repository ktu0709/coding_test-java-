import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	static class BinaryIndexTree{
        long tree[];
        int treeSize;

        public BinaryIndexTree(int arrSize){
            tree = new long[arrSize+1];
        }
        public int prefix_sum(int i){
        	int result = 0;
        	while(i>0){
        		result += tree[i];
        		i -= (i & -i);
        	}
        	return result;
        }
    	public void update(int i, long dif){
    	while(i < tree.length){
    			 tree[i] += dif;
        		i += (i & -i);
    		}
		}
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
	}
}
