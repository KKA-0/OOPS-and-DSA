package Recusion.RecusAddition;
// Task: Add all the numbers between 0 to n using recursion
import java.util.Scanner;

public class RecusAddition {

    static int recus(int n){
        if(n == 1) return n;
        return n + recus(n - 1);
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        System.out.println(recus(n));
    }
}
