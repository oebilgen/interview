package com.ozan.interview;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created with IntelliJ IDEA.
 * User: oe
 * Date: 10/18/12
 * Time: 9:15 PM
 * To change this template use File | Settings | File Templates.
 */
public class StringOperations {
    public static int findDuplicate3Chars(String s)
    {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        StringBuilder b = new StringBuilder();
        int inputLength = s.length() - 3;
        for (int i = 0; i < inputLength; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                b.append(s.charAt(i + j));
            }
            String key = b.toString();
            if (map.containsKey(key))
            {
                return map.get(key);
            }
            map.put(key, i);
            b.setLength(0);
        }
        return -1;
    }

    public static ArrayList<String> findCommonStrings(String s1, String s2)
    {
        ArrayList<String> result = new ArrayList<String>();
        String[] words1 = s1.split("\\W");
        String[] words2 = s2.split("\\W");
        int words1Length = words1.length;
        int words2Length = words2.length;

        for (int i = 0; i < words1Length; i++)
        {
            if (words1[i].length() == 0)
            {
                continue;
            }
            for (int j = 0; j < words2Length; j++)
            {
                if (words2[i].length() == 0)
                {
                    continue;
                }
                if (result.contains(words1[i]))
                {
                    continue;
                }
                if (words1[i].equals(words2[j]))
                {
                    result.add(words1[i]);
                }
            }
        }

        return result;
    }

}
