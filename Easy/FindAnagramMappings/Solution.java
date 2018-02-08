import java.util.*;


public class Solution{
	
    public int[] anagramMappings(int[] A, int[] B) {
    	int i;
    	int j;
    	int[] a = new int[A.length];
    	//List<Integer> list = new ArrayList<>();
    	for(i=0; i<A.length;i++){
    		for(j=0;j<B.length;j++){
    			if(B[j]==A[i]){
    				a[i]=j;
    			}
    		}
    		
    	}
     // int[] array = list.stream().mapToInt(k->i).toArray();
      return a;  
    }
    public static void main(String[] args){
    	Solution s = new Solution();
    	int i;
    	int[] A = {12, 28, 46, 32, 50};
		int[] B = {50, 12, 32, 46, 28};
    	int[] l = s.anagramMappings(A, B);
    	for(i=0;i<l.length;i++){
    		System.out.println(l[i]);
    	}
    	
    }

}

