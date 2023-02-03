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
}
