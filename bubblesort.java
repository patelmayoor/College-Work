import java.util.*;

public class Bubble {

    public static void BubbleSort(int arr[]) {
        for (int turn = 0; turn < arr.length - 1; turn++) {
            boolean swap = false;
            for (int j = 0; j < arr.length - 1 - turn; j++) {
                if (arr[j] > arr[j + 1]) {
                    // For Swapping
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap = true;
                }
            }
            if (!swap) {
                break;
            }
        }
    }

    public static void SelectionSort(int arr[]) {
        for(int i=0; i<arr.length-1; i++) {
            int Min=i;
            for(int j=i+1; j<arr.length; j++) {
                if(arr[Min] > arr[j]) { 
                    Min= j;
               }
            }
            // For Swapping
            int temp = arr[Min];
            arr[Min] = arr[i];
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
        System.out.println("case:");
        System.out.println("best");
        System.out.println("Average");
        System.out.println("Worst");
        int choice = sc.nextInt();

        int size = 1000;
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
                    arr[i] = rand.nextInt(10001);
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

        long startTime = System.nanoTime(); 
        SelectionSort(arr);
        long endTime = System.nanoTime();
        
        Display(arr);
        long duration = endTime - startTime;

        System.out.println("Start : " + startTime);
        System.out.println("End : " + endTime);
        System.out.println("Time : " + duration  + " milli");
    }
}