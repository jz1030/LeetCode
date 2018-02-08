class Solution {
    public void rotate(int[] nums, int k) {
    	/*

        int j = 0;
    	
    	while(j < k+1){
    		for(int i = 1;i<nums.length;i++){
                temp = nums;
    			nums[i] = nums[i-1];

    			nums[0] =  temp[nums.length-1];

    	}
    		}


    	for(int i=0; i<nums.length;i++){
                System.out.println(nums[i]+ " ");

            }
            */
    
    

     int[] array1 = new int[nums.length];
        int n = nums.length;
        k= k%n;
    
            for(int i = nums.length-1; i >= nums.length - k; i--){
				    array1[i-nums.length+k] = nums[i];
            }
        
            for(int i = 0; i<nums.length-k;i++){
    			    array1[k+i] = nums[i];
            }


            
            for(int i=0; i<array1.length;i++){
    			    System.out.println(array1[i]+ " ");

    	    }

          


}


    public static void main(String[] args){
    	Solution s = new Solution();

    	int[] nums = {1,2};
    	int k = 1;
    	s.rotate(nums, k);
    }





}

