import java.util.*;

class Solution {
    public int numJewelsInStones(String J, String S) {
    	int nums = 0;
    	char[] s = S.toCharArray();
    	char[] j = J.toCharArray();


    	Map<Character,Integer> map = new HashMap<>();
    	for(int i = 0; i < j.length; i++){
    		map.put(j[i],i);
    	}
    	for(int i = 0 ; i< s.length; i++){
    		if(map.containsKey(s[i])){
    			nums ++ ;
    		}
    	}

    	return nums;
    }

    public static void main(String[] args){
    	Solution s = new Solution();
    	int a = s.numJewelsInStones("aA", "AaAbbjdkdk");

    	System.out.println(a);
    }





        
 
}

