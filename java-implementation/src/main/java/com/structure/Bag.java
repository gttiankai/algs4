package com.structure;
import java.util.Iterator;


public class Bag<Item> implements Iterable<Item>{
    private Node<Item> first;
    private int n;

    // inner class
    private static class Node<Item> {
        private Item item;
        private Node<Item> next;
    }

    public Bag() {
        first = null;
        n = 0;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public int size() {
        return n;
    }
    /**
     * adds the item to this bag
     *
     * */
    public void add(Item item) {
        Node<Item> olderFirst = first;
        first = new Node<Item>();
        first.item = item;
        first.next = olderFirst;
        n++;
    }

    @Override
    public Iterator<Item> iterator() {
        return null;
    }
}
