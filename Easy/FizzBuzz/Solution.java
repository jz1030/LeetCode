import java.util.*;

public class Solution{ 
	public List<String> fizzBuzz(int n) {
		List<String> list = new ArrayList<>();
		int i;

		for(i=1;i<n+1;i++){
			int r = i%3;
			int t = i%5;
			if(r == 0 && t==0){list.add("fizzbuzz");}
			else if(r == 0){list.add("fizz");}
			else if(t == 0){list.add("buzz");}
			
			else list.add(Integer.toString(i));
		}
		return list;
	}

	public static void main(String[] args){
		List<String> list01 = new ArrayList<>();
		Solution s = new Solution();
		list01 = s.fizzBuzz(15);
		System.out.println(Arrays.toString(list01.toArray()));

	}
}