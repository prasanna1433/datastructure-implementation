package io.github.prasanna1433.tree;

//Binary Search Tree is a special kind of tree where the following properties hold:
// -> left child is less than parent
// -> right child is greater than parent

//Reference - https://www.cs.cmu.edu/~adamchik/15-121/lectures/Trees/trees.html
public class BinarySearchTree {

    private static Node root;

    class Node{
        int element;
        BinaryTree.Node leftChild;
        BinaryTree.Node rightChild;

        Node(int value){
            this.element=value;
            this.leftChild=null;
            this.rightChild=null;
        }
    }

    public void insert(int value){

    }

    public void delete(int value){

    }

    public void inorder(){

    }

}
