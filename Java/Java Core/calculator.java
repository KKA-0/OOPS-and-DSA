import java.util.Scanner;

class calculator {

    static class Calc {
        void Sum(int a, int b){
            System.out.print(a+b);
        }
        void Sub(int a, int b){
            System.out.print(a-b);
        }
        void Div(int a, int b){
            System.out.print(a/b);
        }
        void Mul(int a, int b){
            System.out.print(a*b);
        }
        void Choice(int ChoiceInt){
            if(ChoiceInt == 1){
                System.out.print("Addition");
            }else if(ChoiceInt == 2){
                System.out.print("Subtract");
            }
            else if(ChoiceInt == 3){
                System.out.print("Divide");
            }
            else if(ChoiceInt == 4){
                System.out.print("Multiply");
            }
        }
    }

    public static void main(String[] args) {
        try(Scanner myInput = new Scanner(System.in);)
        {
            int ChoiceInt;
            int a;
            int b;
            Calc obj = new Calc();

            System.out.println("How to want to Calculate?\n 1: Sum\n 2: Subtraction\n 3: Division\n 4: Multiplications\n");
            ChoiceInt = myInput.nextInt();

            System.out.print("What Two Numbers you want ");
            obj.Choice(ChoiceInt);
            System.out.print(" ?\n");

            System.out.print("A: ");
            a = myInput.nextInt();
            System.out.print("B: ");
            b = myInput.nextInt();

            if(ChoiceInt == 1){
                System.out.print("Addition is: ");
                obj.Sum(a, b);
            }else if(ChoiceInt == 2){
                System.out.print("Subtraction is: ");
                obj.Sub(a, b);
            }
            else if(ChoiceInt == 3){
                System.out.print("Dividetion: ");
                obj.Div(a, b);
            }
            else if(ChoiceInt == 4){
                System.out.print("Multiplication: ");
                obj.Mul(a, b);
            }
        }
    }    
}
