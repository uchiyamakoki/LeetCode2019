public class TwoSum2 {
    public int[] twoSum(int[] numbers, int target) {
        for (int i=0;i<numbers.length-1;i++){
            for (int t=i+1;t<numbers.length;t++){
                if (numbers[i]+numbers[t]==target){
                    return new int[]{i,t};
                }
            }
        }
        return new int[]{};
    }

}

