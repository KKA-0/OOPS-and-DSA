import java.util.HashSet;
import java.util.Set;
import java.util.Arrays;

class Solution {
    public static int[] intersection(int[] arr1, int[] arr2) {
        int index1 = 0;
        int index2 = 0;
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        Set<Integer> set = new HashSet<>();
        while(index1 < arr1.length && index2 < arr2.length){
            if(arr1[index1] == arr2[index2]){
                set.add(arr1[index1]);
                index1++;
                index2++;
            }
            else if(arr1[index1] < arr2[index2]){
                index1++;
            }
            else if(arr1[index1] > arr2[index2]){
                index2++;
            }
        }
        int[] arr3 = new int[set.size()];
        int index3 = 0;
        for(var num: set){
            arr3[index3] = Integer.parseInt(num.toString());
            index3++;
        }
        
        return arr3;
    }
    public static void main(String[] args) {
        int[] arr1 = new int[5];
        arr1[0] = 4;
        arr1[1] = 4;
        arr1[2] = 8;
        arr1[3] = 9;
        arr1[4] = 9;
        int[] arr2 = new int[3];
        arr2[0] = 4;
        arr2[1] = 5;
        arr2[2] = 9;
        intersection(arr1, arr2);
    }
}