import java.util.*;

class Solution {
    public boolean judgeCircle(String moves) {
    	int x = 0;
    	int y = 0;

    	char[] a = moves.toCharArray();
    	for(int i = 0; i< a.length;i++){
    		if(a[i] == 'U'){
    			y++;
    		}

    		if(a[i] == 'D'){
    			y--;
    		}

    		if(a[i] == 'L'){
    			x--;
    		}

    		if(a[i] == 'R'){
    			x++;
    		}

    	}

    	if(x==0 && y==0){
    		return true;
    	}
      return false;  
    }



    public static void main(String[] args){
    	Solution s = new Solution();
    	boolean a = s.judgeCircle("UD");
    	System.out.println(a);
    }
}