package ru.pravvich.revers;

/**
 * Task. Reversing Linked list like from 1->2->3 to 3->2->1.
 * Solution: {@link ReversingLinkedList#reverse()}.
 *
 * @param <T> type of valid values for current container.
 */
public class ReversingLinkedList<T> {
    /**
     * Head of list.
     */
    private Node head;

    /**
     * Default constructor.
     *
     * @param values all values.
     */
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

    /**
     * Revers the sequence of all values in list.
     *
     * @return reversed list.
     */
    public ReversingLinkedList<T> reverse() {

        Node current = head;

        Node previous = null;

        while (current != null) {

            //Next item.
            Node next = current.getNext();

            //Swap items.
            current.setNext(previous);
            previous = current;
            head = current;

            //Next item.
            current = next;
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

