package io.github.prasanna1433.list;

public class LinkedList {

    private static ListNode head;
    private static ListNode tail;

    LinkedList(){
        head=null;
        tail=null;
    }

    class ListNode{
        int element;
        ListNode next;

        ListNode(int element,ListNode next){
            this.element=element;
            this.next=next;
        }
    }

    /**
     * Add the element in the tail
     * @param  value to be added at the tail of Linked List
     */
    public void addAtTail(int value){
        ListNode node=new ListNode(value,null);

        if(head==null){
            head=node;
            tail=node;
        }else {
            tail.next = node;
            tail=tail.next;
        }
    }

    /**
     * Add the element to the head
     * @param value to be added to the head of the Linked List
     */
    public void addAtHead(int value){
        ListNode node=new ListNode(value,head);
        if(head==null){
            tail=node;
        }
        head=node;

    }

    public int removeAtHead(){
        int result=Integer.MIN_VALUE;
        if(head!=null){
            result=head.element;
            if(head.next==null){
                tail=tail.next;
            }
            head=head.next;
        }
        return result;
    }

    /**
     * print the linked list from the head
     */
    public void printList(){
        ListNode temp=head;

        while(temp!=null){
            System.out.print(temp.element);

            temp=temp.next;
            if(temp!=null) {
                System.out.print(" -> ");
            }else{
                System.out.println("");
            }
        }
    }




}
