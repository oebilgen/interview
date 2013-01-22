package com.ozan.interview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: oe
 * Date: 10/17/12
 * Time: 9:12 PM
 * To change this template use File | Settings | File Templates.
 */
public class Anagram {
    public boolean isAnagram(String s1, String s2)
    {
        if (s1 == null || s2 == null)
        {
            return false;
        }
        int length = s1.length();
        if (length != s2.length())
        {
            return false;
        }
        HashMap<Character, Integer> map1 = new HashMap<Character, Integer>();
        HashMap<Character, Integer> map2 = new HashMap<Character, Integer>();

        for (int i = 0; i<length; i++)
        {
            Character c = s1.charAt(i);
            if (map1.containsKey(c))
            {
                Integer x = map1.get(c);
                map1.put(c, x + 1);
            }
            else
            {
                map1.put(c, 1);
            }
            c = s2.charAt(i);
            if (map2.containsKey(c))
            {
                Integer x = map1.get(c);
                map2.put(c, x + 1);
            }
            else
            {
                map2.put(c, 1);
            }
        }
        if (map1.size() != map2.size())
        {
            return false;
        }
        Iterator it = map1.entrySet().iterator();
        while (it.hasNext())
        {
            Map.Entry pairs = (Map.Entry)it.next();
            Character key = (Character)pairs.getKey();
            if (!map2.containsKey(key) || !map2.get(key).equals(pairs.getValue()))
            {
                return false;
            }
        }
        return true;
    }
}
