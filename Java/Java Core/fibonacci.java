public class fibonacci {
    void fibonacci_n(int n){
        int a=0, b=1;
        for(int i=0; i<n; i++){
            System.out.println(a);
            int temp = a + b;
            a = b;
            b = temp;
        }
        
    }
    public static void main(String[] args) {
        fibonacci obj = new fibonacci();
        obj.fibonacci_n(20);
    }
}
