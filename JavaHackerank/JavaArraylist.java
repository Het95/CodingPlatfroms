package JavaHackerankSolution;

import java.util.ArrayList;
import java.util.Scanner;

public class JavaArraylist {

    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        ArrayList <Integer> arr = new ArrayList<>();
        int  size = scan.nextInt();
        int n = 0;
        ArrayList<Integer>[] intrnlArr = new ArrayList[size];


//Intialiazing internal ArrayList which is declared
    for (int i=0;i<size;i++)
    {
        intrnlArr[i] = new ArrayList<Integer>();
    }

    int d =0;
    int k=0;
    int s = 0;
    while(size!=n)
    {
        d = scan.nextInt();
        for (int i=0;i<d;i++)
        {
                intrnlArr[k].add(scan.nextInt());
        }
       // System.out.println(intrnlArr[s]);
        s++;
    //    System.out.println("s"+s);
        k++;
      //  System.out.println("k"+k);
        n++;
        //System.out.println("n"+n);
    }


//    for (int i=0;i<size;i++)
//    {
//      //  System.out.println("hello");
//        System.out.println(intrnlArr[i]);
//    }

    int q = scan.nextInt();
    ArrayList<Integer>[] queryList = new ArrayList[q];

    for (int i=0;i<q;i++)
    {
        queryList[i] = new ArrayList<Integer>();
    }

    int f = 0;
    while (f!=q) {
        for (int i = 0; i < 2; i++) {
            queryList[f].add(scan.nextInt());
        }
        f++;
    }

//    for (int i=0;i<q;i++)
//    {
//        System.out.println(queryList[i]);
//    }


            for (int j=0;j<q;j++)
            {
                    int r = queryList[j].get(0);
                    int c = queryList[j].get(1);

                    if ((intrnlArr[r-1].size()-1) < c-1)
                    {
                        System.out.println("Error!");
                    }
                    else
                    {
                        System.out.println(intrnlArr[r-1].get(c-1));
                    }
             }

    }
}
