package com.ozan.interview;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Iterator;

/**
 * Created with IntelliJ IDEA.
 * User: oe
 * Date: 10/19/12
 * Time: 8:59 AM
 * To change this template use File | Settings | File Templates.
 */
public class LinkedListIterator implements Iterator<LinkedList> {

    private LinkedList list;

    public LinkedListIterator(LinkedList b)
    {
        this.list = b;
    }

    @Override
    public boolean hasNext() {
        return (this.list != null);
    }

    @Override
    public LinkedList next() {
        LinkedList l = this.list;
        this.list = this.list.getNext();
        return l;
    }

    @Override
    public void remove() {
        throw new NotImplementedException();
    }
}
