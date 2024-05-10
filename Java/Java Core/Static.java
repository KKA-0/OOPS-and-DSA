class hello {
    static class hello_1{
        static void hellomethod(){
            System.out.println("hello");
        }
    }
}

public class Static{

    static void hello_1(){
        System.out.println("hi");
    }

    public static void main(String[] args) {
        hello.hello_1.hellomethod();
        Static.hello_1();
    }
}
