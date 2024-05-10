package MaxMin;

public class MaxMin {
    static int max(int n, int arr[]){
        int max = arr[0];
        for(int i = 1; i < n; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    static int min(int n, int arr[]){
        int min = arr[0];
        for(int i = 1; i < n; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int n = 4;
        int[] arr = new int[n];
        arr[0] = 234;
        arr[1] = 5;
        arr[2] = 9;
        arr[3] = 10;
        
        System.out.println(max(n, arr));
        System.out.println(min(n, arr));
    }
}
