/*
INTUITION:
- Anagram words that have the same frequency of characters, different sequence
- So if we look at every word in our input list and sort each word by character
- this creates a sorted list of characters which we can now use to map our values to 
- essentially hat once sorted will become aht and this can be used as a charKey
*/
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> sMap = new HashMap<>();
        for(String str: strs){
            // sort our current str
            // char[] charArr = str.toCharArray(str);
            char[] charArr = str.toCharArray();
            Arrays.sort(charArr);
            String charKey = new String(charArr);

            sMap.putIfAbsent(charKey, new ArrayList<>());
            sMap.get(charKey).add(str);
        }

        return new ArrayList<>(sMap.values());
        
    }
}
