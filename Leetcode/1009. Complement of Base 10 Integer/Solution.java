class Solution {
    public static int bitwiseComplement(int n) {
        int num = n;
        if (num == 0) return 1;
        int mask = 0;
        while (num != 0) {
            mask = mask << 1 | 1;
            num >>>= 1;
        }
        return (~n) & mask;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(bitwiseComplement(n));
        
    }
}