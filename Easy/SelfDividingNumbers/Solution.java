import java.util.* ;

class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {

    	List<Integer> list = new ArrayList<Integer>();
    	int nums = 0;
    	int nums2 = 0;
    	
    	for(int i = left; i< right+1; i++){
    		char[] r = (Integer.toString(i)).toCharArray();
    		//int[] intArray = new int[r.length];
    		//for(int i = 0 ; i< r.length; i++){
    			//intArray[i] = Character.getNumericValue(r[i]);
    		//}


    		for(int k = 0; k< r.length; k++){

    			if(Character.getNumericValue(r[k]) != 0 && i%Character.getNumericValue(r[k])==0  ){
    				nums ++;
    			}
    		}

    		if(nums == r.length){
    			list.add(i);
    			nums2 ++;}

    		nums = 0;

    	}

    	return list;


    	

        
    }


    public static void main(String[] args){
    	Solution s = new Solution();
    	List<Integer> list = s.selfDividingNumbers(1,22);
    	/*for(int i= 0; i<list.size(); i++){
    		System.out.println(list[i]);

    	}*/
    	System.out.println(list);


    	//System.out.println("The total number of self divided numbers is:  " + nums2);



    }
}