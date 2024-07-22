import java.util.*;

public class SelectionSort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose the case:\n1. Best Case\n2. Average Case\n3. Worst Case");
        int choice = sc.nextInt();

        int size = 100000;
        int arr[] = new int[size];

        switch (choice) {
            case 1:
                for (int i = 0; i < size; i++) arr[i] = i + 1;
                System.out.println("Best Case:");
                break;
            case 2:
                Random rand = new Random();
                for (int i = 0; i < size; i++) arr[i] = rand.nextInt(1000000);
                System.out.println("Average Case:");
                break;
            case 3:
                for (int i = 0; i < size; i++) arr[i] = size - i;
                System.out.println("Worst Case:");
                break;
            default:
                System.out.println("Invalid choice!");
                return;
        }

        long startTime = System.nanoTime();
        selectionSort(arr);
        long endTime = System.nanoTime();

        System.out.println("Time taken to sort: " + (endTime - startTime) / 1000000.0 + " milliseconds");
    }

    public static void selectionSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) minIndex = j;
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}
