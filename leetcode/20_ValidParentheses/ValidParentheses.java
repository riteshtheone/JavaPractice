class ValidParentheses {
    public boolean isValid(String s) {
        if(s.length() == 1 || s.length() % 2 != 0) return false;
        StringBuilder stack = new StringBuilder();
        for(char c : s.toCharArray())
            switch(c){
                case '(', '{', '[' -> stack.append(c);
                case ')' -> {
                    if(stack.isEmpty() || stack.charAt(stack.length()-1) != '(') return false;
                    else stack.deleteCharAt(stack.length()-1);
                }
                case '}' -> {
                    if(stack.isEmpty() || stack.charAt(stack.length()-1) != '{') return false;
                    else stack.deleteCharAt(stack.length()-1);
                }
                case ']' -> {
                    if(stack.isEmpty() || stack.charAt(stack.length()-1) != '[') return false;
                    else stack.deleteCharAt(stack.length()-1);
                }
            }
        return stack.isEmpty();
    }
    
    public static void main(String[] args) {
        var sc = new java.util.Scanner(System.in);
        var s = sc.next();
        System.out.println(new ValidParentheses().isValid(s));
        sc.close();
    }
}