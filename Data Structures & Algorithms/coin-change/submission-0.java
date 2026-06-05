class Solution {
    public int coinChange(int[] coins, int amount) {
        // dynamic programming tabulation
        int dpArr[] = new int[amount +1];
        dpArr[0] = 0;

        for (int curr = 1; curr <= amount; curr++){
            dpArr[curr] = Integer.MAX_VALUE;
            // we have to check each coin for a possible answer
            for(int coin: coins){
                if(coin <= curr){
                int remainder = curr - coin;
                if (dpArr[remainder] != Integer.MAX_VALUE){
                int possibleAns = dpArr[remainder] + 1;
                dpArr[curr] = Math.min(dpArr[curr], possibleAns);
                }
                }
            }
        }
        return dpArr[amount] == Integer.MAX_VALUE ? -1 : dpArr[amount];
    }
}
