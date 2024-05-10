package ReverseArr;

public class ReverseArr {

    static int Rev(int n, int arr[]){
        for(int j = 0; j < n; j++){
            System.out.print(arr[j] + ", ");
        }
        for(int i = 0; i < n / 2; i++){
            int temp = arr[i];
            arr[i] = arr[(n - 1) - i];
            arr[(n - 1) - i] = temp;
        }
        System.out.println();
        for(int j = 0; j < n; j++){
            System.out.print(arr[j] + ", ");
        }
        return 0;
    }

    public static void main(String[] args) {
        int n = 5;
        int[] arr = new int[n];
        arr[0] = 234;
        arr[1] = 5;
        arr[2] = 9;
        arr[3] = 10;
        arr[4] = 230;
        Rev(n, arr);
    }
}
