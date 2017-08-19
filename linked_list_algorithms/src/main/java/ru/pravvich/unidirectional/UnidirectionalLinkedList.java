package ru.pravvich.unidirectional;

import java.util.Iterator;

import static java.lang.String.format;

/**
 * Have unidirectional linked list. Get N'th element from end.
 *
 * Solution method:
 * @see UnidirectionalLinkedList#getElementFromEnd(int) .
 */
public class UnidirectionalLinkedList<V> implements Iterable<V> {
    /**
     * Start point node value always null.
     */
    protected Node start;
    /**
     * Refer to last addition element. Before first edition equals null.
     */
    protected Node last;
    /**
     * Amount contains element.
     */
    protected int size;

    /**
     * Default constructor.
     */
    public UnidirectionalLinkedList() {
        start = new Node(null);
        size = 0;
    }

    /**
     * Get element from end indexing start for 0.
     *
     * @param i number of element from end.
     * @return element by index i.
     */
    public V getElementFromEnd(final int i) {

        final int indexFromStart = size - i;
        int counter = 0;

        final Iterator<V> iterator = iterator();

        while (iterator.hasNext() && indexFromStart > counter++) {
            if (counter != indexFromStart) iterator.next();
            else return iterator.next();
        }

        throw new IllegalArgumentException(format("Element '%s' not exist", i));
    }

    /**
     * Addition element in list.
     *
     * @param value object for addition.
     */
    public void add(final V value) {

        if (size++ != 0) {
            final Node node = new Node(value);
            last.setNext(node);
            last = node;
        } else {
            last = new Node(value);
            start.setNext(last);
        }
    }

    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public Iterator<V> iterator() {

        return new Iterator<V>() {

            Node current = start.getNext();

            @Override
            public boolean hasNext() {
                return current != null && current.getValue() != null;
            }

            @Override
            public V next() {
                final V result = current.getValue();
                current = current.getNext();
                return result;
            }
        };
    }

    /**
     * Determines Class which contain user's value and refer to next element.
     */
    protected class Node {
        /**
         * User's value.
         */
        private V value;
        /**
         * Reference to next element.
         */
        private Node next;

        /**
         * Default constructor.
         *
         * @param value for save.
         */
        protected Node(V value) {
            this.value = value;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }
}
