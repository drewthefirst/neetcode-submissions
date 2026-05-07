class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer>sMap = new HashMap<>();
        HashMap<Character,Integer>tMap = new HashMap<>();

        //edge case
        if(s.length() != t.length()){
            return false;
        }

        //check strings
        for(int i=0; i<s.length(); i++){
            //add values to respective maps
            sMap.put(s.charAt(i), sMap.getOrDefault(s.charAt(i), 0) +1);
            tMap.put(t.charAt(i), tMap.getOrDefault(t.charAt(i), 0) +1);
        }
        return sMap.equals(tMap);

    }
}
