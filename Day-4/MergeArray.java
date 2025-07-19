//Merge two unsorted array into single sorted array by removing duplicates

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MergeArray {
    public static void main(String[] args) {
        int arr1[]={5,2,8,3,2};
        int arr2[]={7,2,5,1,9};
        Set<Integer> resultSet=new HashSet<>();
        for(int num:arr1){
            resultSet.add(num);
        }
        
        for(int num:arr2){
            resultSet.add(num);
        }

        int mergedArray[] = new int[resultSet.size()];
        int index=0;
        for(int num:resultSet){
            mergedArray[index++]=num;
        }

        Arrays.sort(mergedArray);

        for(int i=0;i<mergedArray.length;i++){
            System.out.print(mergedArray[i]+" ");
        }

        // for (int num : mergedArray) {
        //     System.out.print(num + " ");
        // }
        System.out.println();
    }
}
