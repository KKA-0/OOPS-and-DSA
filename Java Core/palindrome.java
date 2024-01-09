class palindrome{

    void check(int i){
        int remainder = 0;
        int temp  = 0;
        int sum = 0;
        temp = i;
        while(temp > 0){
            remainder = temp % 10;
            sum = (sum * 10) + remainder;
            temp = temp / 10;
            System.out.println(remainder+ "  "+sum+ "   "+ temp);
        }
        if(i == sum){
            System.out.println("Valid");
        }else{
            System.out.println("Not Valid");
        }
    }

    public static void main(String[] args) {
        int i = 14341;
        palindrome obj = new palindrome();
        obj.check(i);

    }
}