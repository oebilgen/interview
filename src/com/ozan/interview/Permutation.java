package com.ozan.interview;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: oe
 * Date: 10/17/12
 * Time: 8:17 PM
 * To change this template use File | Settings | File Templates.
 */
public class Permutation {

    public ArrayList<ArrayList<Integer>> findPermutations(ArrayList<Integer> integers)
    {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        if (integers == null || integers.size() == 0)
        {
            return result;
        }
        for (int i = 0; i < integers.size(); i++)
        {
            ArrayList<Integer> subArray = new ArrayList<Integer>();
            for (int j = 0; j < integers.size(); j++)
            {
                if (!integers.get(j).equals(integers.get(i)))
                {
                    subArray.add(integers.get(j));
                }
            }
            ArrayList<ArrayList<Integer>> subResult = this.findPermutations(subArray);
            for (ArrayList<Integer> subPerm : subResult)
            {
                subPerm.add(integers.get(i));
                result.add(subPerm);
            }
            ArrayList<Integer> selfResult = new ArrayList<Integer>();
            selfResult.add(integers.get(i));
            result.add(selfResult);
        }
        return result;
    }
}
