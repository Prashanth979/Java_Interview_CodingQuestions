public class InsertionSort {
    public static void main(String[] args) {
        int arr[]={44,11,55,22,33};
        int n=arr.length;
        
        for(int i=1;i<n;i++){
            int current = arr[i];
            int previous = i-1;
            while(previous>=0 && arr[previous]>current){
                arr[previous+1]=arr[previous];
                previous--;
            }
            arr[previous+1]= current;
        }
        System.out.println("Array after sorting:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
