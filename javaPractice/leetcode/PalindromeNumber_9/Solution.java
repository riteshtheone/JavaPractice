import java.util.Scanner;

class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0) return false;
        if(x < 10) return true;
        var temp = x;
        var reverse = 0;
        while(temp > 0){
            reverse = 10 * reverse + temp % 10;
            temp /= 10;
        }
        return (x == reverse);
    }

    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        var x = sc.nextInt();
        sc.close();
        System.out.println(new Solution().isPalindrome(x));
    }
}
