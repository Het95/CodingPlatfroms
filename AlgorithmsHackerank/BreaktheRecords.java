package AlgorithmsHackerank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BreaktheRecords
{
    public static void main(String[] args) {
        List<Integer> scores = Arrays.asList(12,24,10,24);
        int min = scores.get(0);
        int max = scores.get(0);
        int minCount =0;
        int maxCount =0;
        List <Integer> minmax = new ArrayList<>();

        for (int i=0;i<scores.size();i++)
        {
            if (scores.get(i) < min)
            {
                min = scores.get(i);
                minCount++;
            }

            if (scores.get(i) > max)
            {
                max = scores.get(i);
                maxCount++;
            }
        }

        minmax.add(maxCount);
        minmax.add(minCount);

        System.out.println(minmax);


    }
}
