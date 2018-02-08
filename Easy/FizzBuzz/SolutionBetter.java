import java.util.*;


public class SolutionBetter{
	public List<String> fizzBuzz(int n) {
		List<String> list = new ArrayList<>();
		int i;
		for(i=1;i<n+1;i++){
			list.add(Integer.toString(i));
		}

		



       if(n > 2){

			for(i=2;i<n;i=i+3){
				list.set(i,"Fizz");
			}

			if(n > 4) {

				for(i=4;i<n;i=i+5){
					list.set(i,"Buzz");
				}


				if(n > 14){

					for(i=14;i<n;i=i+15){
						list.set(i,"FizzBuzz");
					}
				}
			}
		}
		
	    

	return list;
	}

	

	public static void main(String[] args){
		List<String> list01 = new ArrayList<>();
		SolutionBetter s = new SolutionBetter();
		list01 = s.fizzBuzz(5);
		System.out.println(Arrays.toString(list01.toArray()));

}

}