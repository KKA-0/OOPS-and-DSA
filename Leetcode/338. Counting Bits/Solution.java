class Solution {
    public static int[] countBits(int n) {
        int j = 0;
        int size = n + 1;
        int[] arr = new int[size];
        for(int i = 0; i <= n; i++){
            int res = 0;
            j = i;
            while(j != 0){
                if((j & 1) == 1){
                    res++;
                }
            j>>>=1;
            }
            arr[i] = res;
        }
        return arr;
    }
    // public static void main(String[] args) {
    //     int n = 5;
    //     countBits(n);
    // }
}