//Write a program in Java to display the first 20 terms of the following series: Ex: 3,6,12,24,48….

public class DisplayProgram {
    public static void main(String[] args) {
        int num=3;
        for(int i=1;i<=20;i++){
            System.out.print(num+", ");
            num=num*2;    
        }
        System.out.println();
    }
}
