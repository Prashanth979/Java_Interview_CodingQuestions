//Program to find second largest element without sorting
public class SecondLargest {
    public static void main(String[] args) {
        int arr[]={-4,-3,-5,-2};
        int largest=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                secondLargest=largest;
                largest=arr[i];
            }else if(arr[i]>secondLargest && arr[i]!=largest){
                //arr[i]>secondLargest --- we might find L and SL in the first 2 elements itself, but there might be chance where we get SL other than 1st 2 elements
                //arr[i]!=largest ---- This case is for, there might be duplicates of largest number
                secondLargest=arr[i];
            }
        }
        System.out.println("Second Largest Element in the array is "+secondLargest);
    }
}
