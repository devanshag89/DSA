package Assignments.Assingment2;

class Solution {
    public boolean check(int[] nums) {
        int count=0;
        if(nums.length==1) return true;
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]>nums[i+1])
            {
             count++;
            }
        }
        if(nums[nums.length-1]>nums[0]) count++;
        return count<=1;
    }
}
