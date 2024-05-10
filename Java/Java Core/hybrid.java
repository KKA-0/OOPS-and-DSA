public class hybrid {
    interface grandparent{
        abstract void grandparent_method();
    }interface parent_1 extends grandparent{

    }interface parent_2 extends grandparent{

    }static class child implements parent_1, parent_2{
        public void grandparent_method(){
            System.out.println("grandparent_method");
        }
    }
    public static void main(String[] args) {
        child obj = new child();
        obj.grandparent_method();
    }
}
