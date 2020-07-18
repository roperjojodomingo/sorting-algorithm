package insertion;

public class InsertionSort {
    public int[] sort(int[] arr)
    {
        for (int i = 0; i < arr.length; i++){
            for (int j = i-1; j >=0; j--)
            {
                if (arr[i] < arr[j])
                {
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }

        }

        return  arr;
    }
}
