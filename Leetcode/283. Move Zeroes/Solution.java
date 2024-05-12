class Solution {
    public static void moveZeroes(int[] nums) {
        int i = 0;
        int j = 0;
        while(j < nums.length){
            if(nums[j] != 0){
                nums[i] = nums[j];
                i++;
                j++;
            }else{
                j++;
            }
        }
        for(int b = i; b < nums.length; b++){
            nums[b] = 0;
        }

        for(int a = 0; a < nums.length; a++){
            System.out.print(nums[a] + ", ");
        }
    }
    public static void main(String[] args) {
        int[] nums = new int[]{0, 1, 0, 3, 12};

        Solution.moveZeroes(nums);
    }
}