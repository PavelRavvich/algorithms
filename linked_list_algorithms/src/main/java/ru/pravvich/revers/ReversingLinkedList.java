package ru.pravvich.revers;

public class ReversingLinkedList<T> {
    // ist head
    private Node head;

    // constructor
    @SafeVarargs
    public ReversingLinkedList(T... values) {

        Node previous = null; //previous node

        for (T value : values) {

            Node node = new Node();
            node.setValue(value);

            if (previous != null) {

                previous.setNext(node);

            } else {

                head = node;
            }

            previous = node;
        }
    }

    public ReversingLinkedList<T> reverse() {

        Node node = head;

        Node previous = null;

        while (node != null) {

            //Next item.
            Node tmp = node.getNext();

            //Swap items.
            node.setNext(previous);
            previous = node;
            head = node;

            //Next item.
            node = tmp;
        }

        return this;
    }

    /**
     * Node class.
     */
    private class Node {
        /**
         * Next node.
         */
        private Node next;
        /**
         * Node value.
         */
        private T value;

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public T getValue() {
            return value;
        }

        public void setValue(T value) {
            this.value = value;
        }
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("[");
        Node node = head;
        while (node != null) {
            String value = (node.value != null) ? node.value.toString() : "null";
            builder.append(value + " ");
            node = node.next;
        }
        builder.append("]");
        return builder.toString();
    }
}

