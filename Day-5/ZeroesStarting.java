//Java Program for the given random array numbers to bring all the zeros to starting 	
//Ex: arr[1,2,5,4,0,2,0,7,0]   o/p: arr[0,0,0,1,2,5,4,2,7]

public class ZeroesStarting {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 5, 4, 0, 2, 0, 7, 0 };
        int result[] = new int[arr.length];
        int n = arr.length;
        int index = n - 1;
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] != 0) {
                result[index--] = arr[i];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = result[i];
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
