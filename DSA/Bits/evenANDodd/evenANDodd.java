package Bits.evenANDodd;

public class evenANDodd {
    public static void main(String[] args) {
        long start = System.nanoTime();
        int a = 123; 
        if((a & 1) == 1){
            System.out.println("NUMBER IS ODD: "+ a);
        }else{
            System.out.println("NUMBER IS EVEN: "+ a);
        }
        System.out.println(System.nanoTime() - start);
    }
}
