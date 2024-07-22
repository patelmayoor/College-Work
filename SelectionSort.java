import java.util.*;

public class SelectionSort {

    public static void SelectionSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) { // Change to < for increasing order
                    minIndex = j;
                }
            }
            // Swap elements
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void Display(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose the case:");
        System.out.println("1. Best Case");
        System.out.println("2. Average Case");
        System.out.println("3. Worst Case");
        int choice = sc.nextInt();

        int size = 100000; // Increase the size for better time measurement
        int arr[] = new int[size];

        switch (choice) {
            case 1:
                for (int i = 0; i < size; i++) {
                    arr[i] = i + 1;
                }
                System.out.println("Best Case:");
                break;
            case 2:
                Random rand = new Random();
                for (int i = 0; i < size; i++) {
                    arr[i] = rand.nextInt(1000000);
                }
                System.out.println("Average Case:");
                break;
            case 3:
                for (int i = 0; i < size; i++) {
                    arr[i] = size - i;
                }
                System.out.println("Worst Case:");
                break;
            default:
                System.out.println("Invalid choice!");
                return;
        }

        Display(arr);

        long startTime = System.nanoTime(); // Use nanoTime for better resolution
        SelectionSort(arr); // Corrected method call
        long endTime = System.nanoTime();
        
        Display(arr);
        long duration = endTime - startTime;

        System.out.println("Start time: " + startTime);
        System.out.println("End time: " + endTime);
        System.out.println("Time taken to sort: " + duration / 1000000.0 + " milliseconds");
    }
}
