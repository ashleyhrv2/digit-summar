package javaPack;

public class DigitSummarizer 
{

    public static int digitSum(int num) 
    {
        int sum = 0;
        while(num > 0)
        {
            sum = sum + (num % 10);
            num = num / 10;
        }
        return sum;
    }

    public static int digitalRoot(int num) 
    {
        int newnum = digitSum(num);

        while(newnum >= 10)
        {
            newnum = digitSum(newnum);
        }

        return newnum;
    }
}