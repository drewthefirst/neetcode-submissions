class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Integer> dupeHM = new HashMap<>();
        int count = 1; // initial value for each int
        for(int num: nums){
            // add conditional to update the count of int if already exist in map
            if(dupeHM.containsKey(num)){
                dupeHM.put(num,count + 1);
                return true;
            }
            dupeHM.put(num,count);
        }
        return false;
    }
}