import java.util.*;


public class HashTableSolution {
	public int[] twoSum(int[] nums, int target){
		int i;
		Map<Integer,Integer> map = new HashMap<>();
		for(i = 0;i<nums.length;i++){
			map.put(nums[i],i);
		for(i=0;i<nums.length;i++){
			int complement = target - nums[i];
			if(map.containsKey(complement)&&map.get(complement) != i){
				return new int[] {i, map.get(complement)};

			}
		}


		}
	return null;
	}

	public static void main(String[] args){
		int i;
		int[] array = {2,7,14,15,16};
        int target = 9;
		HashTableSolution h = new HashTableSolution();
		int[] a = h.twoSum(array, target);
		for(i = 0; i<array.length; i++){
			System.out.println(a[i] + " ");
		}
	}
	
}