package merge;

public class MergeSort {
    public int[] sort(int[] arr)
    {
        int len = arr.length;
        if (len > 1)
        {
            int mid = len / 2;
            int[] left = new int[mid];
            int[] right = new int[len - mid];

            for (int l = 0; l < mid; l++) {
                left[l] = arr[l];
            }

            for (int r = mid; r < len; r++) {
                right[r-mid] = arr[r];
            }

            sort(left);
            sort(right);
            merge(arr, left, right);
        }
        return arr;
    }

    void merge(int[] arr, int[] left, int[] right)
    {
        int l = 0;
        int r = 0;
        int newArrIndex = 0;

        while (l < left.length && r < right.length) {
            if (left[l] < right[r]) {
                arr[newArrIndex] = left[l];
                l++;
            }
            else {
                arr[newArrIndex] = right[r];
                r++;
            }

            newArrIndex++;
        }

        while (l < left.length) {
            arr[newArrIndex] = left[l];
            l++;
            newArrIndex++;
        }

        while (r < right.length) {
            arr[newArrIndex] = right[r];
            r++;
            newArrIndex++;
        }
    }
}
