public class multilevel {
    static class grandparent{
        void grandparent_method() {
            System.out.println("grandparent_method");
        }
    }
    static class parent extends grandparent {

    }
    static class child extends parent{

    }
    public static void main(String[] args) {
        child obj = new child();
        obj.grandparent_method();
    }
}
