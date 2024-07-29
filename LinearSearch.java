import java.util.Scanner;

public class LinearSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array:");
        int N = scanner.nextInt();
        int[] arr = new int[N];

        System.out.println("Enter the " + N + " elements of the array:");
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Enter the element to be searched:");
        int k = scanner.nextInt();

        int index = linearSearch(arr, k);

        if (index == -1) {
            System.out.println("Element " + k + " isn't present in the array.");
        } else {
            System.out.println("Element " + k + " is stored at index location " + index + " in the array.");
        }
    }

    public static int linearSearch(int[] array, int num) {
        for (int i = 0; i < array.length; i++) {
            if (num == array[i]) {
                return i;
            }
        }
        return -1;
    }
}
