package AlgorithmsHackerank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DiagonalDifference
{
    public static void main(String[] args) {
        List <List<Integer>> arr = new ArrayList<>();
        arr.add(new ArrayList<>(Arrays.asList(11,2,4)));
        arr.add(new ArrayList<>(Arrays.asList(4,5,6)));
        arr.add(new ArrayList<>(Arrays.asList(10,8,-12)));

//        for(int i=0;i<arr.size();i++) {
//            int rowSize = arr.get(i).size();
//            for (int j = 0; j < rowSize; j++) {
//                System.out.print(arr.get(i).get(j));
//            }
//            System.out.println();
//        }

        int leftSum =0;
        int rightSum = 0;
        for(int i=0;i<arr.size();i++)
        {
            int rowSize = arr.get(i).size();
            for(int j=0;j<rowSize;j++)
            {
                if(i==j)
                {
                    leftSum += arr.get(i).get(j);
                }

                if((i+j)== arr.size()-1)
                {
                    rightSum += arr.get(i).get(j);
                }
            }
        }

        int diff = leftSum - rightSum;
        System.out.println(diff);

    }
}
