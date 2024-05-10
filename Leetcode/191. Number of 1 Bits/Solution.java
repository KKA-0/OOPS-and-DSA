public class Solution {
    // you need to treat n as an unsigned value
    public static int hammingWeight(int n) {
        int res = 0;
        while(n != 0){
            if((n & 1) == 1){
                res++;
            }
            n >>>= 1;
        }
        return res;
    }
    public static void main(String[] args) {
        int n = 1;
        System.err.println(hammingWeight(n));
    }
}