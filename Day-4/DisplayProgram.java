//Write a program in Java to display the first 10 terms of the following series:	Ex: 1,12,123,1234…..


public class DisplayProgram {
    public static void main(String[] args) {
        //Using Integers
        int term=0;
        for(int i=1;i<=10;i++){
            term=term*10+i;
            System.out.print(term+", ");
        }
        System.out.println();

        //Using Strings
        String num="";
        
        for(int i=1;i<=10;i++){
            num+=i;
            System.out.print(num);
            if(i!=10){
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}
