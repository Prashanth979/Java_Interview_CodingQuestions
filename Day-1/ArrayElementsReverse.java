//Program to print array elements in Reverse Order
public class ArrayElementsReverse {
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
