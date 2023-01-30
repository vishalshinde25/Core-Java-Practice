package numcheck;

public class Palindrome
{
    public boolean isPalindrome(int n)
    {
        int digit, reverse=0, copy=n;
        while(copy>0)
        {
        digit=copy%10;
        reverse=reverse*10+digit;
        copy=copy/10;
        }
        if( reverse==n)
        {
            return true;
        }
        else
        {
            return false;
        }
    }  
}