package Bits.binTodec;

class conversion{
    void convert(int bin){
        int index = 0;
        int result = 0;
        while(bin != 0){
            int last  = bin % 10;
            if(last == 1){
                result = result + (int) Math.pow(2, index);
            }
            index++;
            bin = bin / 10;
        }
        System.out.println(result);
    }
}

public class binTodec {
    public static void main(String[] args) {
        int bin = 101;
        conversion obj = new conversion();
        obj.convert(bin);
    }
}
