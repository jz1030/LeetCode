public class SolutionReal{
	 public boolean detectCapitalUse(String word) {
	 	int i;
	 	int j = 0;
	 	for(i=0;i<word.length();i++){
    		int k = Character.isUpperCase(word.charAt(i)) ? 1:0;
    		if(k==1){j++;}
    	}
    		if(j==word.length() ||j==0){
    			return true;
    		}
    		if(j==1 && Character.isUpperCase(word.charAt(1))){
    			return true;
    		}


    		//System.out.println(k);
    	
    	return false;
    }

    public static void main(String[] args){
    	SolutionReal s = new SolutionReal();
    	s.detectCapitalUse("Yes");
    }
}