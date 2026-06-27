//leetcode 217--Contains Duplicate
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> newArr=new HashSet<>();
        for(int i=0 ; i<nums.length ; i++){
            if(newArr.contains(nums[i])){
                return true;
            }
            newArr.add(nums[i]);
        }
        return false;
    }
}