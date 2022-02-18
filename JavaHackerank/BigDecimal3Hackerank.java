package JavaHackerankSolution;

import java.math.BigDecimal;
import java.util.Scanner;

public class BigDecimal3Hackerank
{
    public static void main(String[] args) {

        String s[] = new String[5];
        Scanner scan = new Scanner(System.in);
        for (int i=0;i<s.length;i++)
        {
            s[i] = scan.next();
        }



        BigDecimal b[] = new BigDecimal[5];
        for (int i=0;i<b.length;i++)
        {
            b[i] = new BigDecimal(s[i]);
        }

        for (int i=0;i<4;i++)
        {
            for (int j=0;j<5-i-1;j++)
            {
                if(b[j].compareTo(b[j+1]) == 1)
                {
                    BigDecimal temp = b[j];
                    b[j] = b[j+1];
                    b[j+1] = temp;
                }
            }
        }

        int k=0;
        for (int i=b.length-1;i>=0;i--)
        {
            if(k<s.length) {
                s[k] = b[i].toString();
                k++;
            }
        }


        for (int i=0;i<s.length;i++)
        {
                System.out.println(s[i]);

        }

    }
}
