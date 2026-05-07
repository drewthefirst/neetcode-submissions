/*
[{()}] is valid
{[}} is not valid
INTUITION
- We can not start with a closing bracket
- Every closing bracket should have a corresponding opening
- Use HashMap to may closing bracket - key to opening bracket - value
- Iterate through string add opening bracket to the stack 
- if current Char is closing bracket we read stack and ensure it matches closing bracket - matching pair found remove from stack
- return stack
*/
class Solution {
    public boolean isValid(String s) {
        Stack <Character> bStack = new Stack<>();
        HashMap<Character,Character> bHashMap = new HashMap<>();
        char[] validOpenings = new char[]{'(','{','['};
        bHashMap.put(')', validOpenings[0]);
        bHashMap.put('}', validOpenings[1]);
        bHashMap.put(']', validOpenings[2]);

        // loop through str
        for(char b:s.toCharArray()){
            if(bHashMap.containsKey(b)){
                if(!bStack.isEmpty() && bStack.peek() == bHashMap.get(b)){
                    bStack.pop();
                } else{
                    return false;
                }
            }
            else{
                bStack.push(b);
            }
        }
        return bStack.isEmpty();
        
    }
}
