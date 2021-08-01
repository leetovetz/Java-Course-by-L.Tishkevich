package com.homework.mylinkedlist;

public class Main {

    public static void main(String[] args) {

        MyLinkedList<String> myLinkedList = new MyLinkedList<>();
        myLinkedList.add("AAA");
        myLinkedList.add("DDD");
        myLinkedList.add("XXX");

        System.out.println(myLinkedList.get(1));
        System.out.println(myLinkedList.size());
        System.out.println(myLinkedList.first());
        System.out.println(myLinkedList.last());
        myLinkedList.addFirst("FFF");
        System.out.println(myLinkedList.first());
        System.out.println(myLinkedList.size());
        myLinkedList.delete(2);
        System.out.println(myLinkedList.size());

        for (String element : myLinkedList) {
            System.out.println(element);
        }
    }
}
