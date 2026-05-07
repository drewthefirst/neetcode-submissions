/*
Why two pointer technique?
- because our array is already sorted

intuition
- sum = nums[lp] + nums[rp]
- compare target to sum if match:
return index +1
if sum<target move lp++
if sum>target move rp--
*/

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int lp=0; int rp=numbers.length-1;
        while(lp<rp){
        int sum = numbers[lp] + numbers[rp];
        if(sum == target){
            return new int[]{lp +1, rp +1};
        } else if(sum<target){
            lp++;
        } else {
            rp--;
        }
        }
        return new int[0];
    }
}
