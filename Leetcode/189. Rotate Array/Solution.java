class Solution {
    public static void rotate(int[] nums, int k) {
        int index = 0;
        int[] arr = new int[nums.length];
        while(index < nums.length){
            arr[(index + k) % nums.length] = nums[index];
            index++;
        }
        for(int i = 0; i < nums.length; i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,5,6,7};
        int k = 3;
        Solution.rotate(nums, k);
    }
}