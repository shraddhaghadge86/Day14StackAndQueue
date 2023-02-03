package com.bridgelabz.day14stackqueue;

public class LinkedList<T> {

    Node<T> head;
    Node<T> tail;
    private int count;

    public int getSeize() {
        return count;
    }

    public void push(T key) {
        Node<T> newNode = new Node(key);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
            count++;
        }
    }

    public void show() {
        Node<T> temp = head;// Node<T> head;  Node<T> temp pointing to the same object that why we save in temp reference of head'
        while (temp != null) {
            System.out.print(temp.key);
            temp = temp.next;

            if(temp != null){
                System.out.print(" => ");
            }
        }
        System.out.println();
    }

    public void append(T key) {
        Node<T> newNode = new Node(key);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        count++;
    }

    public T deleteFirstNode() {
        T data = head.key;
        if (head == null) {
            System.out.println("linkList is null");
        } else {
            head = head.next;
        }
        return data;
    }

    public void deleteLastNode() {
        if (head == null) {
            System.out.println("linkList is null");
        }
        Node secondLast = head;
        Node lastNode = head.next;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }

    public Node<T> searchNode(T key) {
        if (head == null) {
            System.out.println("linkList is null");
        } else {
            Node<T> currentNode = head;
            while (currentNode != null) {
                if (currentNode.key.equals(key)) {
                    return currentNode;
                }
                currentNode = currentNode.next;
            }
        }
        return null;
    }

    public void searchAndDelete(T key) {//70=30=40=56
        Node<T> deleteNode = searchNode(key);//40node
        Node<T> temp = head;//30Node
        while (temp != null) {
            if (temp == deleteNode) {
                head = deleteNode.next;
                break;
            } else if (temp.next == deleteNode) {//40=40
                temp.next = deleteNode.next;//56
//                deleteNode.next = null;//
            }
            temp = temp.next;
        }
    }

    public void searchAndAdd(T searchKey, T addKey) {
        Node<T> searchNode = searchNode(searchKey);//30
        Node<T> temp = searchNode.next;
        Node<T> newNode = new Node<>(addKey);//40
        if (searchNode != null) {
            searchNode.next = newNode;//30=>40
            newNode.next = temp;//40=?70
        }
    }

}
