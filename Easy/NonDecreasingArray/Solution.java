class Solution {
    public boolean checkPossibility(int[] nums) {
    		int j = 0;
    		int i;
    		int k = 0;
    		if(nums.length<3){
    			return true;
    		}

            for(i=1; i<nums.length; i++){
            	if(nums[i]<nums[i-1]){
            		j++;
            		k=i;
            	}
            }

            if(j>1){
            	return false;
            }

            if(j==1){
            	if(nums[nums.length-1]<nums[nums.length-2]){
            	return true;
           		}
           		else if (nums[k+1]<nums[k-1]){
           			int y=0;
           			for(int t = 0; t<k;t++){
           				if(nums[t] <0){
           					y++;

           				}}

           			if(y>0){return true;

           			}

           			else return false;
           	    }


                else if (nums[k+1]<nums[k-1] && nums.length!=3){
           	 	return false;
           		}
           		else return true;



            }
            
            

            return true; 
     }
    




    public static void main(String[] args){
    	Solution s = new Solution();
    	int[] A = {-1,4,2,3};
    	boolean b = s.checkPossibility(A);
    	System.out.println(b);
    }
}