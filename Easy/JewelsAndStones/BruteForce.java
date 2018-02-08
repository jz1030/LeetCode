class BruteForce {
    public int numJewelsInStones(String J, String S) {
        char[] s = S.toCharArray();
        char[] j = J.toCharArray();

        int nums = 0;

        for(int i = 0; i < s.length;i++){
            for(int k = 0; k < j.length; k++){
                if(j[k] == s[i]){
                    nums ++;

                }

            }
        }
        
        return nums;

    }


      public static void main(String[] args){
        BruteForce s = new BruteForce();
        int a = s.numJewelsInStones("aA", "AaAbbjdkdk");

        System.out.println(a);
}
}