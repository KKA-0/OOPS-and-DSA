class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0;
        int j = 0;
        int index = 0;
        int[] result = new int[nums1.length + 1];

        while(i < m && j < n){
            if(nums1[i] >= nums2[j]){
                result[index] = nums2[j];
                j++;
                index++;
            }
            else{
                result[index] = nums1[i];
                i++;
                index++;
            }
        }
        while(m > i){
            result[index] = nums1[i];
            i++;
            index++;
        }
        while(n > j){
            result[index] = nums2[j];
            j++;
            index++;
        }
        for(int a=0; a<nums1.length;a++){
            nums1[a]=result[a];
        }
        // nums1[] = arr[];
        for(int k = 0; k < result.length; k++){
            System.out.println(result[k]);
        }

    }

    public static void main(String[] args) {
        int m = 3;
        int[] nums1 = new int[5];
        nums1[0] = 1;
        nums1[1] = 2;
        nums1[2] = 3;
        int n = 3;
        int[] nums2 = new int[3];
        nums2[0] = 2;
        nums2[1] = 5;
        nums2[2] = 6;
        Solution solution = new Solution();
        solution.merge(nums1, m, nums2, n);
    }
}