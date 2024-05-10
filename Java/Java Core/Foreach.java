public class Foreach {
    public static void main(String[] args) {
        int arr[][] = {{1,2}, {2,3}, {3,4}};
        for (int[] x : arr) {
            for (int y:x) {
                System.out.println(y);
            }
        }
    }
}
