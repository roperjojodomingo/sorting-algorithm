package quick;

public class QuickSort {
    public int[] sort(int[] arr)
    {
        quickSort(arr, 0, arr.length-1);
        return  arr;
    }

    void quickSort(int[] arr, int first, int last)
    {
        if (first < last)
        {
            int partition = partition(arr, first, last);

            quickSort(arr, first, partition-1);
            quickSort(arr, partition+1, last);
        }
    }

    int partition(int[] arr, int first, int last)
    {
        // choose the first element as pivot value
        int pivotValue = arr[first];
        int lower = first+1;
        int upper = last;

        boolean isUpperAndLowerCrossed = false;
        while (!isUpperAndLowerCrossed) {
            while (lower <= upper && arr[lower] <= pivotValue) {
                lower++;
            }

            while (upper >= lower && arr[upper] >= pivotValue) {
                upper--;
            }

            if (upper < lower) {
                isUpperAndLowerCrossed = true;
            }
            else {
                int tmp = arr[lower];
                arr[lower] = arr[upper];
                arr[upper] = tmp;
            }
        }

        int tmp = arr[first];
        arr[first] = arr[upper];
        arr[upper] = tmp;
        return upper;
    }
}
