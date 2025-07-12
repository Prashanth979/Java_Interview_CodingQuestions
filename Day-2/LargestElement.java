//Program to find LargestElement in Array without Sorting
public class LargestElement {
    public static void main(String[] args) {
        int arr[]={2,5,1,4,7,3};
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println("Largest number in the array is "+max);
    }
}
