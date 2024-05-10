class Solution {
    public static boolean isPowerOfTwo(int n) {
        while(n != 0){
            int last = n & 1;
            n = n >> 1;
            if(n != 0 && last == 1){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int n = 16;
        System.out.println(isPowerOfTwo(n));
    }
}