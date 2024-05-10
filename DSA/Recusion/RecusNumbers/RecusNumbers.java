package Recusion.RecusNumbers;

import java.util.Scanner;

// Question Print all the numbers from 1 to N using Recursion and Take the Input N from user
public class RecusNumbers {
    static int recus(int n){
        if(n == 1) return 1;
        System.out.println(n);
        return recus(n - 1);
    }
    public static void main(String[] args) {
        Scanner N = new Scanner(System.in);
        int n = N.nextInt();
        System.out.println(recus(n));
    }
}
