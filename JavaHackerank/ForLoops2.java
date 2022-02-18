package JavaHackerankSolution;

import java.util.Scanner;

public class ForLoops2
{
    public static void main(String []args) {
        Scanner in = new Scanner(System.in);
        int t = 2;
        int result = 0;
        for (int i = 0; i < 2; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            result = 0;
            for (int j = 0; j < n; j++) {
                if(j==0)
                {
                    result = result + (a + (int) (Math.pow(2, j) * b));
                    System.out.print(result + " ");
                }
                else {
                    result = result + ((int) (Math.pow(2, j) * b));
                    System.out.print(result + " ");
                }

            }
        }
    }
}
