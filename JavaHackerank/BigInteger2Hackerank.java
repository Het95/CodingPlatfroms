package JavaHackerankSolution;

import java.math.BigInteger;
import java.util.Scanner;


// How to Take biginteger from user input using scanner class

public class BigInteger2Hackerank
{
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner scan = new Scanner(System.in);
        BigInteger A = scan.nextBigInteger();
        scan.nextLine();
        BigInteger B = scan.nextBigInteger();

        BigInteger C = A.add(B);
        BigInteger D = A.multiply(B);

        System.out.println(C);
        System.out.println(D);
    }
}
