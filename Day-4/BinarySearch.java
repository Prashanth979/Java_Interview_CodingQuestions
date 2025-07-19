
public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 7, 9 };
        int element = 4;
        int index = binSearch(arr, element);
        if (index == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element is found at index " + index);
        }

    }

    public static int binSearch(int arr[], int element) {
        int low = 0, high = arr.length - 1;
        int mid = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            if (arr[mid] == element)
                return mid;
            else if (arr[mid] < element)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }
}
