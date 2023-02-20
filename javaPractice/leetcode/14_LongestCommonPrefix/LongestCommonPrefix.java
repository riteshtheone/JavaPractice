class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        if(strs[0].isEmpty()) return strs[0];
        var prefix = strs[0];
        for(var i = 1; i < strs.length; i++)
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length()-1);
                if(prefix.isEmpty()) return prefix;
            }
        return prefix;
    }

    public static void main(String[] args) {
        var sc = new java.util.Scanner(System.in);
        var strs = new String[3];
        for(var i = 0; i < strs.length; i++)
            strs[i] = sc.nextLine();
        System.out.println(new LongestCommonPrefix().longestCommonPrefix(strs));
        sc.close();
    }
}