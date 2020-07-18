package bubble;


public class BubbleSort {
    public int[] sort(int[] arr)
    {
        for (int i = 0; i < arr.length - 1; i++)
        {
            for (int j = 0; j < arr.length-i-1; j++)
            {
                if (arr[j+1] < arr[j])
                {
                    int tmpNum = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = tmpNum;
                }
            }
        }
        return  arr;
    }
}
