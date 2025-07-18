//Program to print Prime Numbers upto N

public class NPrimeNumbers {
    public static void main(String[] args) {
        int n=30;
        //int count=0;
        for(int i=2;i<=n;i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }

    static boolean isPrime(int num){
        if(num<=1){
            return false;
        }
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0) 
                return false;
        }
    return true;
    }
}
