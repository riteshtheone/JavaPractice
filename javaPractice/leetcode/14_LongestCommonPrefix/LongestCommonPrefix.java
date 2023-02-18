class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        var compare = strs[0];
        var result = "";
        for(var i = 1; i < strs.length; i++)
            if(strs[i].length() < compare.length())
                compare = strs[i];
        for(var i = 0; i < compare.length(); i++)
            for(var j = 0; j < strs.length; j++)
                if(compare.charAt(i) != strs[j].charAt(i)) return result;
                else if(j == strs.length-1 && compare.charAt(i) == strs[j].charAt(i))
                    result += compare.charAt(i);
        return result;
    }

    public static void main(String[] args) {
        var sc = new java.util.Scanner(System.in);
        var strs = new String[3];
        for(var i = 0; i < strs.length; i++){
            strs[i] = sc.nextLine();}
        System.out.println(new LongestCommonPrefix().longestCommonPrefix(strs));
        sc.close();
    }
}