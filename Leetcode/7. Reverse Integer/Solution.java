class Solution {
    static public int reverse(int x) {
      int result = 0;
      while(x != 0){
        int last = x % 10;
        if(result < Integer.MIN_VALUE / 10 || result > Integer.MAX_VALUE / 10)
        {
          return 0;
        }
        result = result * 10 + last;
        x = x / 10;
      }
      return result;  
    }
    public static void main (String[] args) {
        int n  = 1235345999;
        System.out.println(reverse(n));
    }
}