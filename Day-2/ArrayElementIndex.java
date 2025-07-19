import java.util.*;

public class ArrayElementIndex {
    public static void main(String[] args) {
        int arr[]={1,6,7,8,3,8};
        int resultIndex[]=new int[arr.length];
        int count=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the element: ");
        int element=sc.nextInt();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==element){
                resultIndex[count]=i;
                count++;
            }
        }
        if(count==0){
            System.out.println("Element not found");
        }else{
            System.out.print("Element found at [");
            for(int i=0;i<count;i++){
                System.out.print(resultIndex[i]);
                if(i<count-1){
                    System.out.print(", ");
                }
            }
            System.out.print("]");   
        }
        System.out.println();
        sc.close();
    }
}
