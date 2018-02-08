public class Solution {
    public int[] twoSum(int[] nums, int target) {
         int i;
         int j;
         
         int z;
    

        for(i=0;i<nums.length;i++){
            for(j=i+1; j<nums.length; j++){
                z = nums[i] + nums[j];
                if (z == target){
                    return new int[] { i, j };
                }
            }
        }
        return null;
    }
        


    public static void main(String[] args){
        int[] array = {2,7,14,15,16};
        int target = 9;
        Solution t = new Solution();
        int[] r = t.twoSum(array,target);

        for (int i = 0; i < r.length; i++) {
            System.out.print(r[i] + " ");
        }
    }   
}