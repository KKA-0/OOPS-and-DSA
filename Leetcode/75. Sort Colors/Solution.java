class Solution {
    public static void sortColors(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            System.out.print(nums[i]+ ", ");
        }
        int high = nums.length - 1;
        int low = 0;
        int index = 0;
        while(index <= high){
            if(nums[index] == 1){
                index++;
            }else if(nums[index] == 0){
                int temp = nums[index];
                nums[index] = nums[low];
                nums[low] = temp;
                low++;
                index++;
            }else if(nums[index] == 2){
                int temp = nums[index];
                nums[index] = nums[high];
                nums[high] = temp;
                high--;
            }
        }
        System.out.print("\n");
        for(int i = 0; i < nums.length; i++){
            System.out.print(nums[i]+ ", ");
        }
    }
    public static void main(String[] args) {
        int[] nums = new int[6];
        nums[0] = 2;
        nums[1] = 0;
        nums[2] = 2;
        nums[3] = 1;
        nums[4] = 1;
        nums[5] = 0;
        sortColors(nums);
    }
}