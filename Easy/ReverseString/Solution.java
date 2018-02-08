import java.util.*;


class Solution {
    public String reverseString(String s) {
    	int i;
    	int j = s.length()-1;
        char[] array = s.toCharArray();
        char[] c = new char[s.length()];
        //for(i=0;i<s.length();i++){
       // System.out.println(array[i]);

        for(i=0;i<s.length();i++){
        	c[i] = array[j];
        	j--;

        }
        String str = String.valueOf(c);
        System.out.println(str);

        return str;
    }
    

    public static void main(String[] args){
    	Solution s = new Solution();
    	s.reverseString("helllo");

    }
}