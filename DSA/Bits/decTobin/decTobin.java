package Bits.decTobin;
import java.util.ArrayList;
import java.util.List;

class conversion {
    void convert(int Dec) {
        List<Integer> list = new ArrayList<>();
        
        while ( Dec != 0){
            list.add(Dec % 2);
            Dec = Dec / 2;
        }
        int index = 0; // T.C = O(1) S.C = O(1) 
        int b_index = list.size() - 1; // T.C = O(1) S.C = O(1) 

        while(index < b_index){  // T.C = O(n) S.C = O(1) 
            int temp; // T.C = O(1) S.C = O(1) 
            temp = list.get(index); 
            list.set(index, list.get(b_index));
            list.set(b_index, temp);
            index ++;
            b_index --;
        }
        for(int i = 0; i < list.size(); i ++){
            System.out.print(list.get(i) + " ");
        }
    }
}
class Bit_way_DecTOBin {
    void convert(int dec){
        String result = "";
        while(dec != 0){
            int bitwise = dec & 1;
            result = bitwise + result;
            dec = dec >> 1;
        }
        System.out.println(result);
    }
}

public class decTobin {
    public static void main(String[] args) {
        int Dec = 10;
        // conversion obj = new conversion();
        // obj.convert(Dec);
        Bit_way_DecTOBin bit = new Bit_way_DecTOBin();
        bit.convert(Dec);
    }
}
