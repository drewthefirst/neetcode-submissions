/*
INTUITION:
    - Two-pointer technique
        -remove spaces and non-alphanumeric characters from s regex type method
        -left and right pointer should never cross
    - palindrome same going forward as backwards
        if lp == rp move closer to the center of string
            return true
        else return false
    - return boolean
*/

class Solution {
    public boolean isPalindrome(String s) {
        // clean string and 
        s = s.toLowerCase().replaceAll("[^a-zA-Z0-9]","");
        // s.trim();
        System.out.println(s);
        int lp = 0; int rp = s.length() -1;
        while(lp<rp){
            if(s.charAt(lp) != s.charAt(rp)){
                return false;
            }
        lp++;
        rp--;
        }
        return true;
    }
}
