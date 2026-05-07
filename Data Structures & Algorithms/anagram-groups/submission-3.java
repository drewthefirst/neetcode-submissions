/*
Use HashMap and sort the chars in each given str in our list

INTUITION tells me since we are matching we should have keys that are the sorted str
and the values should be mutable list
this allow us to return a new array with updated strings
*/

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for(String str: strs){
            // 3 steps to sort
            char[] charArr = str.toCharArray();
            Arrays.sort(charArr);
            String charKey = new String(charArr);

            map.putIfAbsent(charKey, new ArrayList<>());
            map.get(charKey).add(str);
        }
        return new ArrayList<>(map.values());
    }
}
