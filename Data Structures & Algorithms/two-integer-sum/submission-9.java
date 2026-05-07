/*
    -INTUITION
        -Inputs: int[] nums, int target
        -Output: int[]

        -We are given a target, and an array we are to search the array
        for the 2 values that add to the target and return the index of the two values

        -Approach:
            - we can loop through the array with two nested loops and check every i and j - not efficient
            - use hashmap to add every value in nums array and compare difference to locate the matching value only 1 loop
        
        -Test Case:
        nums = [3,4,5,6] target =7
        add each key to map
        map = {3: 1}, {4: 1}, {5: 1}, {6:1}
        calcuate difference var = target - nums[i] 
        7 -3 = 4
        now search Map for the diff value and return
*/

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap <Integer, Integer> sumMap = new HashMap<>(); // create new empty map

        for (int i=0; i<nums.length; i++){
            int diff = target - nums[i]; // creates diff for each index in array
            if(sumMap.containsKey(diff)){
                return new int[]{sumMap.get(diff), i}; // if our map contains diff key return the diff and i
            }
            sumMap.put(nums[i], i); // add key and value to map
        }
        return new int[]{};
    }
}
