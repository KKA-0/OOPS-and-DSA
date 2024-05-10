public class customArray {
    int[] items;
    int Index;

    public customArray(int initialSize){
        this.items = new int[initialSize];
        this.Index = 0;
    }

    public void insert(int value){
        this.items[Index] = value;
        Index++;
    }

    public String toString(){
        String str = new String();
        for(int i=0; i < 5; i++){
            str = str + this.items[i] + ", ";
        }
        return str;
    }

    public static void main(String[] args) {
        customArray arr = new customArray(5);
        arr.insert(2);
        arr.insert(3);
        arr.insert(4);

        System.out.println(arr);
    }
}
