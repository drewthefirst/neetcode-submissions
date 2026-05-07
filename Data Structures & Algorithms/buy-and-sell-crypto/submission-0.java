/*
- OBJECTIVE:
    - buy stock at the lowest possible price
    - sell stock on a later day at the highest possible profit
    - return the max profit
    - if no profitable sell is possible, return 0

- INTUITION:
    - We cannot sell before we buy
    - So as we iterate through the array:
        1) keep track of the lowest price we have seen so far
        2) treat current element as today's selling price
        3) calculate current profit = current price - lowest price so far
        4) update max profit if current profit is larger
    - This is not about comparing only neighbors
    - This is about comparing each current price against the cheapest buy opportunity before it
    - Dynamic Sliding Window

- PATTERN:
    - One-pass traversal
    - Running minimum
    - Running maximum profit

- FACTS:
    - prices[i] = stock price on day i
    - must buy before sell
    - only one buy and one sell allowed
    - if profit is negative, we do nothing and keep maxProfit as 0

- VARIABLES:
    - minPrice = cheapest price seen so far
    - maxProfit = best profit seen so far
    - currentProfit = profit if we sold today

- STEPS:
    - set minPrice = prices[0]
    - set maxProfit = 0
    - loop through array from index 1 to end
        - if prices[i] < minPrice:
            minPrice = prices[i]
        - else:
            currentProfit = prices[i] - minPrice
            maxProfit = max(maxProfit, currentProfit)
    - return maxProfit

-PSUEDOCODE:
    minPrice = infinity
    maxProfit = 0

    for each price in prices:
        if price < minPrice:
            minPrice = price
        else:
            profit = price - minPrice
            maxProfit = max(maxProfit, profit)

    return maxProfit

- WHY THIS WORKS:
    - minPrice always represents the best day to buy before today
    - current price represents selling today
    - so every iteration checks:
        "if I sold today, what is the best profit I could make?"

- TEST:
    prices = [7,1,5,3,6,4]

    day 0: minPrice = 7, maxProfit = 0
    day 1: price = 1
        1 < 7, so minPrice = 1
    day 2: price = 5
        profit = 5 - 1 = 4
        maxProfit = 4
    day 3: price = 3
        profit = 3 - 1 = 2
        maxProfit stays 4
    day 4: price = 6
        profit = 6 - 1 = 5
        maxProfit = 5
    day 5: price = 4
        profit = 4 - 1 = 3
        maxProfit stays 5

    return 5
*/

class Solution {
    public int maxProfit(int[] prices) {
        //initialize variables
        int minPrice = prices[0]; int maxProfit = 0; int currentProfit; // we need to buy at minPrice, maxProfit for sellingPrice; initialize minPrice as 1 element in the array as this is the 1st day a transaction can happen

        for(int currentPrice: prices){
            if(currentPrice < minPrice){
                //reassign minPrice to currentPrice
                minPrice = currentPrice;
            } else {
                // compute currentProfit and maxProfit
                currentProfit = currentPrice - minPrice;
                maxProfit = Math.max(maxProfit, currentProfit);
            }
        }
        return maxProfit;
    }
}
