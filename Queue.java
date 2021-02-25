package StacksQueues;

public class Queue {
    QueueNode first;
    QueueNode last;

    private static class QueueNode {
        private int data;
        private QueueNode next;

        private QueueNode(int data) {
            this.data = data;
        }
    }

    public void add(int data) {
        QueueNode newNode = new QueueNode(data);
        if (this.last != null) {
            this.last.next = newNode;
            this.last = newNode;
        } else {
            this.last = newNode;
            this.first = newNode;
        }
    }

    public void remove() {
        if (this.first != null) {
            this.first = this.first.next;
        }
    }

    public static void main(String[] args) {
        Queue list = new Queue();
        list.add(2); // first;
        list.add(5);
        list.add(4); // last;
        System.out.println(list.first.data);
        System.out.println(list.last.data);
        list.remove();
        System.out.println(list.first.data);
    }

}
