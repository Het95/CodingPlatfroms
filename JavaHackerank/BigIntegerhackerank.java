package JavaHackerankSolution;

import java.math.BigInteger;

public class BigIntegerhackerank
{

    public static void main(String[] args) {

        String n = "13";
        BigInteger num;
        num = new BigInteger(n);


        boolean flag = num.isProbablePrime(1); // certainty 1 means it is prime or composite
        // reference geeksforgeeks

        if(flag)
        {
            System.out.println("prime");
        }
        else
        {
            System.out.println("not prime");
        }


    }

}
