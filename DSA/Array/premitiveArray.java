import java.util.ArrayList;
import java.util.List;

class premitiveArray{
    public static void main(String[] args) {
        // Array in Java [ Premitive ]

        // Normal Method of Making Array
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;

        for(int i = 0; i < 5; i++){
            System.out.println(arr[i]);
        }

        // Java Method of making Array
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        System.out.println(list);
    }
}