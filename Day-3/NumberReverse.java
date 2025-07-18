

public class NumberReverse {
    public static void main(String[] args) {
        int num = 123;
        int n = num;
        int revNumber=0;
        while(n>0){
            int digit = n%10;
            revNumber = revNumber*10+digit;
            n=n/10;
        }
        System.out.println("Reverse number of "+num+" is "+revNumber);
    }
}
