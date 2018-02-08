import java.util.* ;

class BetterSolution {
    public List<Integer> selfDividingNumbers(int left, int right) {

        List<Integer> list = new ArrayList<>();
        int k = 4;
        int nums = 0;

        for(int i = left; i < right+1; i++){
            while((i/(Math.pow(10,k)))!= 0.0 && i%(i/(int)(Math.pow(10,k))) == 0 && k>0 ){
                nums ++;
                System.out.println(nums);
                k--;
                i = i-(i/(int)(Math.pow(10,k)))* (int)Math.pow(10,k);

            }

            if(nums == (Integer.toString(i)).length()){
                list.add(i);
            }
            nums = 0;


        }
        return list;

    }


    public static void main(String[] args){
        BetterSolution s = new BetterSolution();
        List<Integer> list = s.selfDividingNumbers(1,22);
        System.out.println(list);
    }

}