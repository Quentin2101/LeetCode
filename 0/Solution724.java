public class Solution724 {
    public int pivotIndex(int[] nums) {
        int sumR = 0;
        int sumL = 0;
        for (int i = 0; i<nums.length; i++) {
            sumR+=nums[i];
        }
        for (int i = 0; i<nums.length; i++) {
            sumR-=nums[i];
            if(i>0) {
                sumL+=nums[i-1];
            }
            if (sumR==sumL) {
                return i;
            }
        }
        return -1;
    }
}
