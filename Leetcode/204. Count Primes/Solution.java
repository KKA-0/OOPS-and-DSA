class Solution {

    // NIAVE

    // public static int countPrimes(int n) {
    //     int items = 0;
    //     if(n  == 0 || n == 1) return 0;
        
    //     for(int i = 2; i < n; i++){
    //         int temp = 0;
    //         if(i == 2 || i == 3){
    //             temp = 1;
    //         }
    //         for(int j = 2; j <= i / 2; j++){
    //             if(i % j == 0) {
    //                 temp = 0;
    //                 break;
    //             }
    //             else {
    //                 temp = 1;
    //             }
    //         }
    //         if(temp == 1){
    //             items++;
    //         }
    //     }
    //     return items;
    // }

    public static int countPrimes(int n) {
            if(n  == 0 || n == 1) return 0;
            int result = 0;
            int[] arr = new int[n + 1];
            for(int i = 2; i<n; i++){
                if(arr[i] == 0){
                    result++;
                    for(int j = 2 * i; j<n; j = j + i){
                        if(arr[j] == 0){
                            if((j % i) == 0){
                                arr[j] = 1;
                            }
                        }
                    }
                }
            }
            return result;
    }
    public static void main(String[] args) {
        int n = 20;
        System.out.println(countPrimes(n));
    }
}