package com.bridgelabz.day14stackqueue;

public class Queue {

    /*
     * creating Object
     */
    LinkedList linkedList = new LinkedList();

    /*
     * Appending the value at first place calling method through object
     */
    public void append(Object data) {
        linkedList.append(data);
    }
    /*
     * calling method to display value in linkedList/stack
     */
    public void displayQueue() {
        linkedList.show();
    }
    public void peek() {
        if (linkedList.head != null) {
            System.out.println("Peaked from Queue : " + linkedList.head.key);
        } else {
            System.out.println("No element left in the Queue.");
        }
    }

    /*
     * 5.method to delete peaked value
     */
    public void pop() {
        linkedList.deleteLastNode();
    }

    public void emptyQueue() {
        while (linkedList.head != null) {
           pop();
        }
        peek();
    }
}
