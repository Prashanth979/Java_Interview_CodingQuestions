//Write a program in Java to display the first 10 terms of the following series:
//"	Ex: 8,88,888,8888…....


public class DisplayProgram1 {
    public static void main(String[] args) {
        long n=0;
        
        for(int i=1;i<=10;i++){ 
            n = (n*10)+8;
            System.out.print(" "+n);  
        }
        System.out.println();
    }
}
