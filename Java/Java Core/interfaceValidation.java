interface parent{

}

class child implements parent{
    void method_1(){
        System.out.println("hello");
    }

}

public class interfaceValidation {
    public static void main(String[] args) {
        child obj = new child();
        if( obj instanceof parent ){
            obj.method_1();
        }
    }
}
