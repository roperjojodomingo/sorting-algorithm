import bubble.BubbleSort;
import insertion.InsertionSort;
import merge.MergeSort;
import quick.QuickSort;
import selection.SelectionSort;

public class Main {
    public static void printArray(int[] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {9,1,3,8,4,7,5,2,6};
        BubbleSort bubbleSort = new BubbleSort();
        printArray(bubbleSort.sort(arr));
        SelectionSort selectionSort = new SelectionSort();
        printArray(selectionSort.sort(arr));
        InsertionSort insertionSort = new InsertionSort();
        printArray(insertionSort.sort(arr));
        MergeSort mergeSort = new MergeSort();
        printArray(mergeSort.sort(arr));
        QuickSort quickSort = new QuickSort();
        printArray(quickSort.sort(arr));
    }
}
