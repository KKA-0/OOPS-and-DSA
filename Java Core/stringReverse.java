public class stringReverse {
    void reverse(String str) {
    String[] strArrbackward = new String[str.length()];
    String[] strArrForward = str.split("");
    System.out.println(str);
    for(int j = 0; j < str.length(); j++){
        if(j != 0){
            int a = str.length() - (j+1);
            strArrbackward[j] = strArrForward[a];
        }else{
            int a = str.length() - 1;
            strArrbackward[j] = strArrForward[a];
        }
    }
    String reversedString = String.join("" , strArrbackward);
    System.out.println(reversedString);
    }
    public static void main(String[] args) {
        String str = "karan";
        stringReverse obj = new stringReverse();
        obj.reverse(str);
    }
}
