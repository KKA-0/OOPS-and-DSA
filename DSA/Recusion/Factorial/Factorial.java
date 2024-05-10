package Recusion.Factorial;

import java.util.Scanner;

public class Factorial {
    
    static int fact(int n){
        if(n == 1) return n;
        return n * fact(n - 1);
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        System.out.println(fact(n));
    }
}
