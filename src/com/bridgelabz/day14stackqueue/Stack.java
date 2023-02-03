package com.bridgelabz.day14stackqueue;

public class Stack<T> {
    /*
     * creating Object
     */
    LinkedList linkedList = new LinkedList();

    /*
     * pushing the value at first place calling method through object
     */
    public void push(Object data) {
        linkedList.push(data);
    }

    /*
     * calling method to display value in linkedList/stack
     */
    public void displayStack() {
        linkedList.show();
    }

    public void peek() {
        if (linkedList.head != null) {
            System.out.println("Peaked from stack : " + linkedList.head.key);
        } else {
            System.out.println("No element left in the stack.");
        }
    }

    /*
     * 5.method to delete peaked value
     */
    public Node pop() {
        peek();
        linkedList.head = linkedList.head.next;
        return linkedList.head;
    }

    public void emptyStack() {
        while (linkedList.head != null) {
            pop();
        }
        peek();
    }
}
