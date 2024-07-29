
import java.util.Scanner;

public class BinarySearch {

    public static void sort(int[] array) {
        // Bubble sort implementation
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap elements
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static int binarySearch(int[] array, int num) {
        int left = 0, right = array.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (array[mid] == num) {
                return mid;
            }
            if (array[mid] < num) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array:");
        int N = scanner.nextInt();

        if (N <= 0) {
            System.out.println("Invalid number of elements.");
            return;
        }

        int[] arr = new int[N];

        System.out.println("Enter the " + N + " elements of the array:");

        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        sort(arr);

        System.out.println("Enter the element to be searched:");
        int k = scanner.nextInt();

        int index = binarySearch(arr, k);

        if (index == -1) {
            System.out.println("Element " + k + " isn't present in the array.");
        } else {
            System.out.println("Element " + k + " is stored at index location " + index + " in the array.");
        }

    }
}
