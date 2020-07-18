package selection;

public class SelectionSort {
    public int[] sort(int[] arr)
    {
        for (int i = 0; i < arr.length-1; i++){
            int index = i;
            for (int j = i+1; j < arr.length; j++)
            {
                if (arr[index] > arr[j]) {
                    index = j;
                }
            }

            if (i != index)
            {
                int tmpVal = arr[index];
                arr[index] = arr[i];
                arr[i] = tmpVal;
            }
        }

        return  arr;
    }
}
