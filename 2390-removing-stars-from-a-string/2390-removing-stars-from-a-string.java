class Solution {
    public String removeStars(String s) {
        Stack <Character> stack = new Stack<>();
        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch=='*'){
                stack.pop();
            }else{
                stack.push(s.charAt(i));
            }
        }
        StringBuilder str = new StringBuilder();
        if(stack.isEmpty()){
            return str.toString();
        }
        for(char ch : stack){
            str.append(ch);
        }
        return str.toString();
    }
}