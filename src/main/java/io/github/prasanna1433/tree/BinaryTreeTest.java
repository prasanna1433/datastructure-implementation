package io.github.prasanna1433.tree;

public class BinaryTreeTest {
    public static void main(String args[]){
        BinaryTree bTree=new BinaryTree();
        bTree.insertLevelOrder(10);
        bTree.insertLevelOrder(20);
        bTree.insertLevelOrder(30);

        bTree.inorder(BinaryTree.root);
        System.out.println();

        bTree.insertLevelOrder(40);
        bTree.insertLevelOrder(50);
        bTree.insertLevelOrder(60);
        bTree.insertLevelOrder(70);

        bTree.inorder(BinaryTree.root);
        System.out.println();

        bTree.deleteNode(10);

        bTree.inorder(BinaryTree.root);
        System.out.println();


    }
}
