/*
Problem: Count Hills and Valleys in an Array
Link: https://leetcode.com/problems/count-hills-and-valleys-in-an-array/
Difficulty: Easy
Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public int countHillValley(int[] nums) {
        int i =0;
        int j =1;
        int noOfHillValley =0;

        while(j+1< nums.length){
            if((nums[j] > nums[i] && nums[j] > nums[j+1])||
            (nums[j]< nums[i]&& nums[j] < nums[j+1]) ){
                noOfHillValley++;
                i=j;
            }
            j++;
        }
        return noOfHillValley;
    }
}
