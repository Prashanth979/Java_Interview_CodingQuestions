
public class LinearSearch {
    public static void main(String[] args) {
        int element = 9;
        int arr[]= {1,3,5,2,6,7};
        int index = linearSearch(arr,element);
        if(index==-1){
            System.out.println("Element not found");
        }else{
            System.out.println("Element found at "+index+" index");
        }
    }
    
    public static int linearSearch(int arr[],int element){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==element){
                return i;
            }
        }
    return -1;
    }

}
