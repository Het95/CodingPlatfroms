package Hackerank30DaysofCode;

import java.util.Scanner;

public class Day6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=2;
        String s[] = new String[n];

        for (int i=0;i<n;i++)
        {
            s[i] = scan.nextLine();
        }

        for (int i=0;i<n;i++)
        {
            char a[] = s[i].toCharArray();
            for (int j=0;j<s[i].length();j = j+2)
            {
                    System.out.print(a[j]);
            }

            System.out.print(" ");

            for (int j=1;j<s[i].length();j = j+2)
            {
                System.out.print(a[j]);
            }

            System.out.println();
        }

//            for (int i = 0; i < s.length(); i++) {
//                if (i % 2 == 0) {
//                    System.out.print(a[i]);
//                }
//            }
//
//            System.out.print(" ");
//            for (int i = 0; i < s.length(); i++) {
//                if (i % 2 != 0) {
//                    System.out.print(a[i]);
//                }
//            }
//
//        }

    }
}
