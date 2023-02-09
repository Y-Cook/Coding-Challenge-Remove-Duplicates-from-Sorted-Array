class Solution {
    public int removeDuplicates(int[] nums) {
        int largestInteger = nums[0];
        int duplicates = 0;
        int k = 1;
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > largestInteger) {
                largestInteger = nums[i];
                
                nums[i - duplicates] = largestInteger;
                k++;
            }
            else {
                duplicates++;
            }
        }
        return k;
    }
}
