package io.github.prasanna1433.tree;

//Binary Tree are special kind of data structure where each node consists of left and right child and a recursive definition of the same
//There is no ordering constraint placed on the binary tree and hence insertion and deletion can be done in the order we prefer
//Insertion - We can do a level order insertion
//Deletion - We can do a delete of the mentioned node and replace it with last element in the tree

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {

    public static Node root;

    class Node{
        int element;
        Node leftChild;
        Node rightChild;

        Node(int value){
            this.element=value;
            this.leftChild=null;
            this.rightChild=null;
        }
    }

    BinaryTree(){
        root=null;
    }

    public void insertLevelOrder(int value){
        if(root==null){
            Node newNode=new Node(value);
            root=newNode;
            return;
        }

        Node temp;
        Queue<Node> q=new LinkedList();
        q.add(root);

        while(!q.isEmpty()){
            temp=q.peek();
            q.remove();

            if(temp.leftChild==null){
                temp.leftChild=new Node(value);
                return;
            }else{
                q.add(temp.leftChild);
            }

            if(temp.rightChild==null){
                temp.rightChild=new Node(value);
                return;
            }else{
                q.add(temp.rightChild);
            }
        }
    }

    public void deleteNode(int value){
        Node temp=new Node(0);
        Node keyNode=temp;
        Queue<Node> q=new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            temp=q.peek();
            q.remove();

            if(temp.element==value){
                keyNode=temp;
            }
            if(temp.leftChild!=null)
                q.add(temp.leftChild);

            if(temp.rightChild!=null)
                q.add(temp.rightChild);
        }

        int deepestElement=temp.element;
        deleteDeepest(temp);
        keyNode.element=deepestElement;
    }

    private void deleteDeepest(Node deepestNode) {
        Node temp;
        Queue<Node> q=new LinkedList<>();
        q.add(root);


        while(!q.isEmpty()){
            temp=q.peek();
            q.remove();

            if(temp.leftChild!=null){
                if(temp.leftChild==deepestNode){
                    temp.leftChild=null;
                    return;
                }else{
                    q.add(temp.leftChild);
                }
            }

            if(temp.rightChild!=null){
                if(temp.rightChild==deepestNode){
                    temp.rightChild=null;
                    return;
                }else{
                    q.add(temp.rightChild);
                }
            }
        }

    }


    public void inorder(Node temp){
        if(temp==null)
            return;

        inorder(temp.leftChild);
        System.out.print(temp.element+" ");
        inorder(temp.rightChild);
    }


}
