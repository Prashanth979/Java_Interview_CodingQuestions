

public class PrimeNumberCheck {
    public static void main(String[] args) {
        int n=29;
        int count=0;
        for(int i=2;i<Math.sqrt(n);i++){
            if(n%i==0){
                count++;
            }
        }
        if(count==0){
            System.out.println("Given number "+n+" is prime number");
        }else{
            System.out.println("Given number "+n+" is not prime number");
        }
    }
}
