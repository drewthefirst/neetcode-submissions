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
        int count = 1;
        HashMap <Integer, Integer> dupeHM = new HashMap<>();

        for(int num: nums){ // enhanced for loop as we do not need index
            if(dupeHM.containsKey(num)){
                dupeHM.put(num, count++);
                return true;
            }
            dupeHM.put(num, count);
        }
         return false;
        
    }
}