package io.github.prasanna1433.list;

public class LinkedListTest {

    public static void main(String args[]){
        LinkedList list=new LinkedList();

        list.addAtHead(3);
        list.addAtHead(6);
        list.addAtTail(1);
        list.addAtTail(2);
        list.addAtHead(7);


        list.printList();

        list.addAtHead(4);
        list.addAtHead(5);

        list.printList();
        int result=Integer.MAX_VALUE;
        do{
            result=list.removeAtHead();
            if(result!=Integer.MIN_VALUE) {
                System.out.print(result);
                System.out.print(" - ");
            }

        }while(result!=Integer.MIN_VALUE);

        System.out.println("");
        list.addAtHead(3);
        list.addAtHead(6);
        list.addAtTail(1);
        list.printList();

    }
}
