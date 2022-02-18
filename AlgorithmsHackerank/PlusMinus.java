package AlgorithmsHackerank;

import java.util.Arrays;
import java.util.List;

public class PlusMinus
{
    public static void main(String[] args) {
        List <Integer> arr = Arrays.asList(1,1,-1,0,-1);
        float size = arr.size();
        float pos = 0;
        float neg = 0;
        float zero = 0;

        for (int i=0;i<size;i++)
        {
            if (arr.get(i) > 0)
            {
                pos++;
            }
            else if (arr.get(i) < 0)
            {
                neg++;
            }
            else
            {
                zero++;
            }
        }
        String p = String.format("%.6f",pos/size);
        String n = String.format("%.6f",neg/size);
        String z = String.format("%.6f",zero/size);


        System.out.println(p);
        System.out.println(n);
        System.out.println(z);



    }
}
