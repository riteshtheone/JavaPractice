class Solution {
    public int romanToInt(String s) {
        int n, value, prev, result;
        n = s.length(); value = 0; result = 0;
        while(--n >= 0){
            prev = value;
            value = switch (s.charAt(n)) {
                case 'I' -> 1;
                case 'V' -> 5;
                case 'X' -> 10;
                case 'L' -> 50;
                case 'C' -> 100;
                case 'D' -> 500;
                case 'M' -> 1000;
                default -> throw new IllegalArgumentException("Unexpected value: " + s.charAt(n));};
            // result = (4 * value < result) ? result - value : result + value;
            // result = (value << 2 < result) ? result - value : result + value;
            result = (value < prev) ? result - value : result + value;
        }
        return result;
    }

    public static void main(String[] args) {
        var sc = new java.util.Scanner(System.in);
        String s = sc.next();
        System.out.println(new Solution().romanToInt(s));
        sc.close();
    }
}