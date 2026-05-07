class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       // Sort chars
       // Utilize hashmap 

       HashMap<String, List<String>> ssMap = new HashMap<>();
       // enter loop of strings
       for(String s: strs){
        // sort our characters of word in given array
        char[] charArray = s.toCharArray();
        Arrays.sort(charArray);
        String charKey = new String(charArray);

        ssMap.putIfAbsent(charKey, new ArrayList<>());
        ssMap.get(charKey).add(s);
       }
       return new ArrayList<>(ssMap.values());
    }
}
