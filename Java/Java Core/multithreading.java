class class_1 extends Thread{
    public void run() {
        int n = 100;
        for(int i = 0; i <= n; i++ ){
            System.out.println("hi");
        }
    }
}

class class_2 extends Thread{
    public void run() {
        int n = 100;
        for(int i = 0; i <= n; i++ ){
            System.out.println("hello");
        }
    }
}

public class multithreading {
    public static void main(String[] args) {
        class_1 obj = new class_1();
        class_2 obj2 = new class_2();
        obj.start();
        obj2.start();   
    }
}
