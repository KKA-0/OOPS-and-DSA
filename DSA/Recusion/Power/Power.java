package Recusion.Power;

public class Power {

    static int power(int n, int x){
        
        // Recursive
        if(x == 0) return 1;
        if(x == 1) return n;
        return n * power(n, x - 1);
        
        // Itrative
        
        // int r = 1;
        // for(int i = 1; i <= x; i++){
        //     r = r * n;
        // }
        // return r;

    }

    public static void main(String[] args) {
        int n = 4;
        int x = 5;
        System.out.println(power(n ,x));
    }
}
