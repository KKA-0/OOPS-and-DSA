public class factorial {
    static class factor {
        void fac(int n){
            int result = 1;
           for(int i = 1; i <= n; i++){
            System.out.println(i);
            result = result * i;
           }
           System.out.println(result);
        }
    }
    public static void main(String[] args) {
        int n = 10;
        factor factors = new factor();
        factors.fac(n);

    }
}
