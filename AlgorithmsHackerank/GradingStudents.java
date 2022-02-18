package AlgorithmsHackerank;

import java.util.Arrays;
import java.util.List;

public class GradingStudents {
    public static void main(String[] args) {
        List <Integer> grades = Arrays.asList(73,67,38,33);

        for (int i=0;i< grades.size();i++)
        {
            int next = 0;
            int div = grades.get(i) / 5;
            next = div*5 + 5;

            if(next-grades.get(i) < 3 && grades.get(i)>37)
            {
                grades.set(i,next);
            }
        }

        System.out.println(grades);
    }
}
