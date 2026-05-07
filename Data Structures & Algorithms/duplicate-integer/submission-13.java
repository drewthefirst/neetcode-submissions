/*
-INTUITION
    - Input: nums[]
    - Output: boolean

    We can add each value to a hashMap and init a count of 1 as the value
    if map has key of current val we can increment the count by 1,
    other wise we can return false
*/

class Solution {
    public boolean hasDuplicate(int[] nums) {

        HashMap<Integer, Integer> hashishi = new HashMap<>();

        for (int num: nums) { //enhanced for loop 
            
            if (hashishi.containsKey(num)) {
                return true;
            }

            hashishi.put(num,1);
        }
        return false;

    }
}