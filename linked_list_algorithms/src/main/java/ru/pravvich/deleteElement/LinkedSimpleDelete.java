package ru.pravvich.deleteElement;

import java.util.Iterator;

/**
 * Task: Delete element from Linked List.
 * Solution: {@link LinkedSimpleDelete#delete(int)}.
 */
public class LinkedSimpleDelete<T> implements Iterable<T> {

    private Node head;

    private Node tail;

    private int size = 0;

    public LinkedSimpleDelete() {
        head = new Node(null);
        tail = new Node(null);
        head.setNext(tail);
    }

    public int size() {
        return size;
    }

    public void add(final T value) {
        Node node = new Node(value);

        if (size++ == 0) {
            head.setNext(node);
            node.setNext(tail);
            return;
        }

        Node last = head.getNext();

        while (last.getNext() != tail) {
            last = last.getNext();
        }

        last.setNext(node);
        node.setNext(tail);
    }

    public void delete(int index) {

        if (index < 0 || index >= size) throw new IllegalArgumentException();

        if (index == 0) {
            final Node post = head.getNext().getNext();
            head.setNext(post);
            return;
        }

        Node target = head.getNext();

        for (int i = 0; i < index - 1; i++) {
            target = target.getNext();
        }

        Node prev = target;
        Node post = target.getNext().getNext();
        prev.setNext(post);
    }

    @Override
    public Iterator<T> iterator() {

        return new Iterator<T>() {

            private Node current = head.getNext();

            @Override
            public boolean hasNext() {
                return current != tail;
            }

            @Override
            public T next() {

                final T value = current.getValue();

                current = current.next;

                return value;
            }
        };
    }


    class Node {

        private T value;
        private Node next;

        public Node(T value) {
            this.value = value;
        }

        public T getValue() {
            return value;
        }

        public void setValue(T value) {
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
