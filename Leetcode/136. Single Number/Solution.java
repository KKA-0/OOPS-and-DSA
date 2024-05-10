class Solution {
    public static int singleNumber(int[] nums) {
        int result = 0;
        for(int i = 0; i < nums.length; i++){
            result = result ^ nums[i];
        }
        
        return result;
    }
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 3;
        arr[1] = 2;
        arr[2] = 2;
        arr[3] = 5;
        arr[4] = 3;
        System.out.println(singleNumber(arr));
    }
}