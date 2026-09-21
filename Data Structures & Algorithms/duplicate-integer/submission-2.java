class Solution {
    public boolean hasDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i = 0; i < nums.length-1; i++){
            nums[i] = nums[i] ^ nums[i+1];
            if(nums[i] == 0){
                return true;
            }
        }
        return false;
    }
}