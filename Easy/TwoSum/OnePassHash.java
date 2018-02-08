import java.util.*;

public class OnePassHash{
	public int[] twoSum(int[] nums, int target){
		Map<Integer, Integer> map = new HashMap<>();
		int i;
		for(i = 0; i<nums.length;i++){
			int complement = target - nums[i];
			map.put(nums[i],i);
			if(map.containsKey(complement)&&map.get(complement) != i){
				return new int[] {i, map.get(complement)};
			}
			//map.put(nums[i],i);
		} 
	return null;
	}


	public static void main(String[] args){
		int i;
		int[] array = {2,7,14,15,16};
        int target = 9;
		OnePassHash h = new OnePassHash();
		int[] a = h.twoSum(array, target);
		for(i = 0; i<array.length; i++){
			System.out.println(a[i] + " ");
		}
}
}