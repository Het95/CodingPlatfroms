package AlgorithmsHackerank;

import java.util.Arrays;
import java.util.List;

public class MinMax
{
    public static void main(String[] args) {
        long max = Long.MIN_VALUE;
        long min  = Long.MAX_VALUE;
        List <Integer> arr = Arrays.asList(1,2,3,4,5);

        for (int i=0;i<arr.size();i++)
        {
            if(arr.get(i) < min)
            {
                min = arr.get(i);
            }
        }

        for (int i=0;i<arr.size();i++)
        {
            if(arr.get(i) > max)
            {
                max = arr.get(i);
            }
        }

        long sum = 0;
        for (int i=0;i<arr.size();i++)
        {
            sum += arr.get(i);
        }

        long minSum = sum - max;
        long maxSum = sum - min;

        System.out.print(minSum+" "+maxSum);

    }
}
