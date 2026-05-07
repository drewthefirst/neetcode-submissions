class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap <Integer , Integer> dupeHashMap = new HashMap<>();
        // initialized value for all keys
        int count = 1;

        for (int num: nums){
            // conditional - checkMap for num key utilize replace vs put?
            if(dupeHashMap.containsKey(num)){
                dupeHashMap.replace(num,count + 1);
                return true;
            }
            dupeHashMap.put(num, count);
        }
        return false;
    }
}