package com.ozan.interview;

import com.sun.javaws.exceptions.InvalidArgumentException;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 * Created with IntelliJ IDEA.
 * User: oe
 * Date: 10/18/12
 * Time: 8:26 PM
 * To change this template use File | Settings | File Templates.
 */
public class IntegerOperations {
    public static ArrayList<ArrayList<Integer>> findThreeSum(Integer[] integers)
    {
        Arrays.sort(integers);
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        int listSize = integers.length - 1;
        int b, e = 0;
        for (int i = 0; i < listSize - 3; i++)
        {
            b = i + 1;
            e = listSize - 1;
            while (b < e)
            {
                int sum = integers[i] + integers[b] + integers[e];
                if (sum == 0)
                {
                    ArrayList<Integer> r = new ArrayList<Integer>();
                    r.add(integers[i]);
                    r.add(integers[b]);
                    r.add(integers[e]);
                    result.add(r);
                    break;
                }
                else if (sum > 0)
                {
                    e--;
                }
                else
                {
                    b++;
                }
            }
        }
        return result;
    }

    public static ArrayList<Integer> fibonacciNumbers(int max)
    {
        ArrayList<Integer> result = new ArrayList<Integer>();
        int a = 0;
        int b = 1;
        result.add(0);
        result.add(1);
        boolean rotate = true;
        while (a < max && b < max)
        {
            if (rotate)
            {
                a += b;
                result.add(a);
                rotate = false;
            }
            else
            {
                b += a;
                result.add(b);
                rotate = true;
            }
        }
        return result;
    }

    public double squareRoot(double x)
    {
        double epsilon = 0.000001;
        double base = 0;
        double increment = 1;
        while (increment > epsilon)
        {
            double diff = base*base - x;
            if (diff < 0)
            {
                base += increment;
            }
            else if (diff > 0)
            {
                base -= increment;
                increment /= 10;
            }
            else
            {
                break;
            }
        }
        return base;
    }

    public ArrayList<Integer> sortArrays()
    {
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(3);
        a.add(5);
        a.add(7);
        a.add(9);
        a.add(null);
        a.add(null);
        a.add(null);
        ArrayList<Integer> b = new ArrayList<Integer>();
        b.add(6);
        b.add(8);
        b.add(10);

        int aSize = a.size();
        int bIndex = b.size() - 1;
        int aIndex;
        for (aIndex = 0; aIndex < aSize; aIndex++)
        {
            if (a.get(aIndex) == null)
            {
                break;
            }
        }
        aIndex--;
        aSize = Math.min(aSize, bIndex + aIndex + 2);
        while (aSize-- > 0)
        {
            if (aIndex < 0 && bIndex >= 0)
            {
                a.set(aSize, b.get(bIndex));
                bIndex--;
            }
            else if (bIndex < 0 && aIndex >= 0)
            {
                a.set(aSize, a.get(aIndex));
                aIndex--;
            }
            else
            {
                a.set(aSize, (a.get(aIndex).compareTo(b.get(bIndex)) > 0) ? a.get(aIndex--) : b.get(bIndex--));
            }
        }
        return a;
    }

    public static double division(double a, double b) throws Exception
    {
        double epsilon = Double.MIN_NORMAL;
        double step = 1.0;
        double result = 0;
        double temp;
        double sign = 1;
        if (b == 0)
        {
            throw new Exception("Division by zero!");
        }
        if (a < 0)
        {
            a *= -1;
            if (b < 0)
            {
                b *= -1;
            }
            else
            {
                sign = -1;
            }
        }
        if (b < 0)
        {
            b *= -1;
            sign = -1;
        }
        while (step > epsilon)
        {
            temp = result * b;
            if (temp == a)
            {
                break;
            }
            else if (temp > a)
            {
                result -= step;
                step *= 0.1;
                result += step;
            }
            else
            {
                result += step;
            }
        }
        return result * sign;
    }

    public static int romanToLatin(String romanNumber) throws Exception
    {
        HashMap<String, Integer> romanLetters = new HashMap<String, Integer>();
        romanLetters.put("I", 1);
        romanLetters.put("V", 5);
        romanLetters.put("X", 10);
        romanLetters.put("L", 50);
        romanLetters.put("C", 100);
        romanLetters.put("D", 500);
        romanLetters.put("M", 1000);
        int stringLength = romanNumber.length() - 1;

        int result = 0;
        int last = 0;
        int sign = 1;
        int current;

        // MDCCCCLXXXXVIIII == 1999

        for (int i = stringLength; i >= 0; i--)
        {
            current = romanLetters.get(romanNumber.subSequence(i, i+1));
            if (current > last)
            {
                result += current;
                sign = 1;
            }
            else if (current == last)
            {
                result += current * sign;
            }
            else
            {
                result -= current;
                sign = -1;
            }
            last = current;
        }
        return result;
    }

    public static double clockAngle(int hours, int minutes)
    {
        double minuteAngle = minutes * 6;
        double hourAngle = hours * 30 + minutes / 2.0;
        double result = hourAngle - minuteAngle;
        if (result < 0)
        {
            result += 360;
        }
        return result;
    }

}
