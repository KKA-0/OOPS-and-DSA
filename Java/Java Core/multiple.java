class class_1{
    void method_1(){
        System.out.println("hello");
    }
}
interface class_2{
    default void method_2(){
        System.out.println("bye");
    }
}
public class multiple extends class_1 implements class_2 {

    public static void main(String[] args) {
        multiple obj = new multiple();
        obj.method_1();
        obj.method_2();
    }
}
