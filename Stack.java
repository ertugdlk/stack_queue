package StacksQueues;

public class Stack {
    private StackNode top;

    private static class StackNode {
        private int data;
        private StackNode next;

        private StackNode(int data) {
            this.data = data;
        }

    }

    // add node to top of the stack list
    public void push(int data) {
        StackNode newNode = new StackNode(data);

        if (this.top != null) {
            newNode.next = this.top;
            this.top = newNode;
        } else {
            this.top = newNode;
        }
    }

    // pop node top of the stack list
    public void pop() {
        if (this.top != null) {
            this.top = this.top.next;
        } else {
            System.out.println("no node top of the stack list");
        }
    }

    public boolean isEmpty() {
        if (this.top != null) {
            return false;
        } else {
            return true;
        }
    }

    // peak the top node
    public int peekTopValue() {
        int topNodeValue = this.top.data;

        return topNodeValue;
    }

    // print stack list
    public void printList() {
        StackNode currNode = this.top;
        while (currNode != null) {

            System.out.println(currNode.data);
            currNode = currNode.next;
        }
    }

    public static void main(String[] args) {
        Stack newStack = new Stack();
        newStack.push(5); // bottom top next=null
        newStack.push(3); // next = this.top ; this.top = newnode
        newStack.push(8);
        newStack.pop();
        newStack.printList();
        // boolean result = newStack.isEmpty();
        System.out.println("Top Value:");
        System.out.println(newStack.peekTopValue());
    }
}