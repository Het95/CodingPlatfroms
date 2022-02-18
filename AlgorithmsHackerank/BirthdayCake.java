package AlgorithmsHackerank;

import java.util.Arrays;
import java.util.List;

public class BirthdayCake
{
    public static void main(String[] args) {
        List<Integer> candles = Arrays.asList(4,4,1,3);
        int max = Integer.MIN_VALUE;
        int count = 0;

        for (int i=0;i<candles.size();i++)
        {
            if(candles.get(i) > max)
            {
                max = candles.get(i);
            }
        }

        for (int i=0;i<candles.size();i++)
        {
            if(candles.get(i) == max)
            {
                count++;
            }
        }

        System.out.println(count);
    }
}
