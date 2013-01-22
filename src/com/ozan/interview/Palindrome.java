package com.ozan.interview;

/**
 * Created with IntelliJ IDEA.
 * User: oe
 * Date: 10/17/12
 * Time: 7:25 PM
 * To change this template use File | Settings | File Templates.
 */
public class Palindrome {

    private void reverse(StringBuilder b, int startIndex, int endIndex)
    {
        for (int i = 0; i < (endIndex - startIndex)/2; i++)
        {
            char tmp = b.charAt(startIndex + i);
            b.setCharAt(startIndex + i, b.charAt(endIndex - i));
            b.setCharAt(endIndex - i, tmp);
        }
    }

    public String findPalindrome(String s)
    {
        StringBuilder b = new StringBuilder(s);
        int startIndex = 0;
        int endIndex = 0;
        while (true)
        {
            if (endIndex > b.length() - 1)
            {
                if (endIndex > 0)
                {
                    endIndex--;
                    this.reverse(b, startIndex, endIndex);
                    break;
                }
            }
            if (b.charAt(endIndex) == ' ')
            {
                endIndex--;
                this.reverse(b, startIndex, endIndex);
                startIndex = endIndex = endIndex + 2;
            }
            else
            {
                endIndex++;
            }
        }
        return b.toString();
    }
}
