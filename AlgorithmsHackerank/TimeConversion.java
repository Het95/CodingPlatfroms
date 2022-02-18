package AlgorithmsHackerank;

public class TimeConversion
{
    public static void main(String[] args) {
        String s= "12:40:22AM";
        StringBuilder sb = new StringBuilder(s);
        String sub;
        int combine = 0;
        String replace;

        String finalString = "";


        if (s.contains("PM"))
        {
            if (s.contains("12"))
            {
                String str = "12";
                sb.replace(0,2,str);
            }
            else {
                sub = String.valueOf(sb.subSequence(0, 2));
                combine = Integer.parseInt(sub);

                combine += 12;

                sb.replace(0, 2, String.valueOf(combine));
            }
            sb.delete(8,10);
            finalString = sb.toString();


        }
        else if (s.contains("AM"))
        {
            if (s.contains("12"))
            {
                String str = "00";
                sb.replace(0,2,str);
            }
            sb.delete(8,10);
            finalString = sb.toString();
        }

        System.out.println(finalString);
    }
}
