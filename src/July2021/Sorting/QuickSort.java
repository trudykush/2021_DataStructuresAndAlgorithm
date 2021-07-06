package July2021.Sorting;

import java.util.Scanner;

public class QuickSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of cases: ");
        int numberOfCases = sc.nextInt();
        while (numberOfCases-- > 0) {
            System.out.println("Size of array");
            int n = sc.nextInt();
            int[] arr = new int[n];
            System.out.println("Enter Elements of array:");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            quickSortSolution(arr, 0,n - 1);

        }
    }

    private static void quickSortSolution(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);

            quickSortSolution(arr, low, pi-1);
            quickSortSolution(arr, pi+1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {

        int pivot = arr[high];
        int i = low - 1;

        for (int j = 0; j <= high - 1; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i+1, high);

        return 0;
    }

    private static void swap(int[] arr, int i, int j) {

    }
}
