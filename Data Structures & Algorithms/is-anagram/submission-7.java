class Solution {
    public boolean isAnagram(String s, String t) {
        // Create hashmaps
        HashMap <Character, Integer> sMap = new HashMap<>();
        HashMap <Character, Integer> tMap = new HashMap<>();
        

        // edge cases
        if(s.length() != t.length()){
            return false;
        }
        // loop array for 1 string character and add objects to maps
        for (int i = 0; i < s.length(); i++){
            char sCurrentChar = s.charAt(i);
            char tCurrentChar= t.charAt(i);
            sMap.put(sCurrentChar, sMap.getOrDefault(sCurrentChar,0) + 1);
            tMap.put(tCurrentChar, tMap.getOrDefault(tCurrentChar,0) + 1);
        }
        return tMap.equals(sMap);
    }
}
