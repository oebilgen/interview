package com.ozan.interview;

/**
 * Created with IntelliJ IDEA.
 * User: oe
 * Date: 10/18/12
 * Time: 5:49 PM
 * To change this template use File | Settings | File Templates.
 */
public class BalancedBinaryTree extends BinaryTree
{
    public BalancedBinaryTree(int newData)
    {
        super(newData);
    }

    @Override public void add(int newData)
    {
        super.add(newData);
        this.rebalance();
    }


}
