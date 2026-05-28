import java.util.HashSet;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> nums_set = new HashSet<Integer>();
        int nums_length = nums.length;
        for(int i = 0; i<nums_length; i++){
            if(nums_set.contains(nums[i])){
                return true;
            }
            else{
                nums_set.add(nums[i]);
            }
        }
        return false;
    }
}