import java.util.Scanner;

interface Sortable {
    void sort(int[] arr);
}

class BubbleSort implements Sortable {
    public void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
            }
        }
    }
}

class SelectionSort implements Sortable {
    public void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min])
                    min = j;
            }
            int t = arr[min];
            arr[min] = arr[i];
            arr[i] = t;
        }
    }
}

public class Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements (space separated):");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        System.out.print("Choose sorting method (1 for Bubble Sort, 2 for Selection Sort): ");
        int choice = sc.nextInt();

        Sortable sorter = (choice == 1) ? new BubbleSort() : new SelectionSort();
        sorter.sort(arr);

        System.out.print("Sorted array: ");
        for (int x : arr)
            System.out.print(x + " ");

        System.out.println();
        sc.close();
    }
}
