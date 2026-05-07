class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Integer> seenMap = new HashMap<>();
        int countVal = 1;
        for (int num: nums) {
            if(seenMap.containsKey(num)) {
                seenMap.put(num, countVal + 1);
                return true;
            } else {
                seenMap.put(num,countVal);
            }
        }
        return false;
    }
}