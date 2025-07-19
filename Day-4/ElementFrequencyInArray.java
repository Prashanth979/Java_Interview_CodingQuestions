// Program to find Frequency of each element in an Array without using Collections

public class ElementFrequencyInArray {
    public static void main(String[] args) {
        int arr[]={2,3,1,4,6,7,3,1,4};
        boolean visited[] = new boolean[arr.length];

        for(int i=0;i<arr.length;i++){
            if(visited[i] == true)
                continue;
                
            int count=1;

            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                    visited[j] = true;
                }
            }
            System.out.println("Frequency of element "+arr[i]+" is "+count);
        }

    }
}



