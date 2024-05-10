package DeleteElem;
import java.util.Scanner;

public class DeleteElem {
    static int del(int index, int n, int arr[]){
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + ", ");
        }
        System.out.println("\nDeleting Element on Index: " + index);
        for(int j = index; j < n - 1; j++){
            arr[j] = arr[j + 1];
        }
        arr[n - 1] = 0;
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + ", ");
        }
        return 1;
    }

    public static void main(String[] args) {
        int n = 4;
        int[] arr = new int[n];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        Scanner strr = new Scanner(System.in);
        int index = strr.nextInt();
        del(index, n, arr);
    }
}
