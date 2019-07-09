package com.structure;
import java.util.Iterator;
import java.util.NoSuchElementException;


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
        return new ListIterator(first);
    }

    private class ListIterator implements Iterator<Item>{
        private Node<Item> current;

        public ListIterator(Node<Item> first) {
            current = first;
        }


        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public Item next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            Item item = current.item;
            current = current.next;
            return item;
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }
}
