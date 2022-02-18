package JavaHackerankSolution;

public class Hourglass2DArray
{
    public static void main(String[] args) {
        int arr[][] = {{-1,-1,0,-9,-2,-2},{-2,-1,-6,-8,-2,-5},{-1,-1,-1,-2,-3,-4},{-1,-9,-2,-4,-4,-5},{-7,-3,-3,-2,-9,-9},{-1,-3,-1,-2,-4,-5}};
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i=0;i<4;i++)
        {

            for (int j=0;j<4;j++)
            {
                sum = 0;
                if (true)
                {
                    sum += arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j+1]+arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
                    System.out.println(arr[i][j]+" "+arr[i][j+1]+" "+arr[i][j+2]+" "+arr[i+1][j+1]+" "+arr[i+2][j]+" "+arr[i+2][j+1]+" "+arr[i+2][j+2]+" "+"i"+i+" "+"j"+j+" "+"sum"+sum);
                }

                System.out.println("Maxsum"+maxSum+" "+"Sum"+sum);
                if(sum > maxSum)
                {
                    maxSum = sum;
                }
            }

        }

        System.out.println(maxSum);
    }
}
