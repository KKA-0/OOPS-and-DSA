import java.util.List;
import java.util.LinkedList;
// javac inBuildLinklist.java && java inBuildLinklist.java

public class inBuildLinklist {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);
    }
}
