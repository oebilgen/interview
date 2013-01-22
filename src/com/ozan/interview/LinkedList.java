package com.ozan.interview;

import com.sun.org.apache.bcel.internal.generic.LNEG;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created with IntelliJ IDEA.
 * User: oe
 * Date: 10/18/12
 * Time: 5:02 PM
 * To change this template use File | Settings | File Templates.
 */
public class LinkedList extends Object {
    private int data;
    private LinkedList next;

    public LinkedList(int newData)
    {
        this.data = newData;
        this.next = null;
    }

    public LinkedList getNext()
    {
        return this.next;
    }

    public int getData()
    {
        return this.data;
    }

    public LinkedList getLast()
    {
        LinkedList temp = this;
        while (temp.next != null)
        {
            temp = temp.next;
        }
        return temp;
    }

    public int size()
    {
        int size = 0;
        LinkedList temp = this;
        while (temp != null)
        {
            size++;
            temp = temp.next;
        }
        return size;
    }

    public void append(int newData)
    {
        LinkedList temp = this.getLast();
        temp.next = new LinkedList(newData);
    }

    public LinkedList prepend(int newData)
    {
        LinkedList temp = new LinkedList(newData);
        temp.next = this;
        return temp;
    }

    @Override public String toString()
    {
        LinkedList temp = this;
        StringBuilder b = new StringBuilder();
        while (true)
        {
            b.append(temp.data);
            if (temp.next == null)
            {
                b.append(" -> NULL");
                break;
            }
            else
            {
                b.append(" -> ");
                temp = temp.next;
            }
        }
        return b.toString();
    }

    public void reverse()
    {
        LinkedList begin = this;
        int size = this.size();

        for (int i = 0; i < size/2; i++)
        {
            LinkedList temp = begin;
            for (int j = 0; j<size - i*2 - 1; j++)
            {
                 temp = temp.next;
            }
            if (temp != begin)
            {
                int d = temp.data;
                temp.data = begin.data;
                begin.data = d;
            }
            begin = begin.next;
        }
    }

    public BinaryTree toBinaryTree()
    {
        BinaryTree b = new BinaryTree(this.data);
        LinkedList temp = this.next;
        while (temp != null)
        {
            b.add(temp.data);
            temp = temp.next;
        }
        return b;
    }

    public BalancedBinaryTree toBalancedBinaryTree()
    {
        BalancedBinaryTree b = new BalancedBinaryTree(this.data);
        LinkedList temp = this.next;
        while (temp != null)
        {
            b.add(temp.data);
            temp = temp.next;
        }
        return b;
    }

    // Sorts in O(N log N) time
    public void sort()
    {
        LinkedList temp = this;
        TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();
        while (temp != null)
        {
            if (map.containsKey(temp.data))
            {
                map.put(temp.data, map.get(temp.data) + 1);
            }
            else
            {
                map.put(temp.data, 1);
            }
            temp = temp.next;
        }
        Iterator it = map.entrySet().iterator();
        temp = this;
        while (it.hasNext())
        {
            Map.Entry<Integer, Integer> ele = (Map.Entry)it.next();
            for (int i = 0; i < ele.getValue(); i++)
            {
                temp.data = ele.getKey();
                temp = temp.next;
            }
        }
    }
}
