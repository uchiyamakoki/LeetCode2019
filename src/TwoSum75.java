public class TwoSum75 {
    public int[] twoSum(int[] numbers, int target) {
        //int len=numbers.length;
        int[] indexs=new int[2];
        for(int i=0;i<numbers.length-1;i++){
            for (int t=i+1;t<numbers.length;t++){
                if (numbers[i]+numbers[t]==target){
                    indexs[0]=i;
                    indexs[1]=t;
                }
            }
        }
        return indexs;
    }

}

