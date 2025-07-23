public class SelectionSort {
    public static void main(String[] args) {
        int arr[]={44,11,55,22,33};
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int smallestIndex=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[smallestIndex])
                    smallestIndex=j;
            }
            int temp=arr[i];
            arr[i]=arr[smallestIndex];
            arr[smallestIndex]=temp;
        }
        System.out.println("Array after sorting:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
