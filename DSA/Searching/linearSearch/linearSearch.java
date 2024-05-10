package Searching.linearSearch;

public class linearSearch {
    int size = 5;
    int[] arr = new int[size];
    
    public linearSearch() {
        this.arr[0] = 12;
        this.arr[1] = 25;
        this.arr[2] = 33;
        this.arr[3] = 45;
        this.arr[4] = 53;
    }

    public int indexOf(int find) {
        // Linear Search Logic
        for(int i=0; i<this.arr.length; i++){
            if(this.arr[i] == find){
                return i; 
            }
        }
        return -1; 
    }
    public static void main(String[] args) {
        linearSearch obj = new linearSearch();
        
        System.out.println(obj.indexOf(53));
    }
}
