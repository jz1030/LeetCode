import java.util.*;

public class HashSolution{
	public int[] anagramMappings(int[] A, int[] B) {
		Map<Integer,Integer> map = new HashMap<>();
		int i;
		int[] a = new int[A.length];
		int j;
		for(i=0;i<A.length;i++){
			map.put(B[i],i);
		}
		//System.out.println(Arrays.asList(map));
	//}

	/*public static void main(String[] args){
		int[] B = {50, 12, 32, 46, 28};
		int[] A = {12, 28, 46, 32, 50};
		HashSolution h = new HashSolution();
		h.anagramMappings(A, B);
	}
}*/	
		for(i=0;i<A.length;i++){
			int h = A[i];
			if(map.containsKey(h)){
				a[i]=map.get(h);
				
			}
			else a[i] = -1;

		}
		return a;



	}

	public static void main(String[] args){
		HashSolution h = new HashSolution();
		int[] A = {12, 29, 46, 32, 50};
		int[] B = {50, 12, 32, 46, 28};
		int[] l = h.anagramMappings(A,B);
		int i;
		//if(l != null){
		for(i = 0; i<A.length;i++){
			System.out.println(l[i]);
		}
		//}

	}
}

