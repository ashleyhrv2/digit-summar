package javaPack;

public class main
{
    public static void main(String[] args) 
    {
            int num1 = 351;
            int num2 = 78;
            int num3 = 98875;
            int root1 = DigitSummarizer.digitalRoot(num1);
            int root2 = DigitSummarizer.digitalRoot(num2);
            int root3 = DigitSummarizer.digitalRoot(num3);

            System.out.println("digital root of " + num1 + " = " + root1);
            System.out.println("digital root of " + num2 + " = " + root2);
            System.out.println("digital root of " + num3 + " = " + root3);
    }
}