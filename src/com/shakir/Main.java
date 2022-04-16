package com.shakir;

public class Main   {

    public static void main(String[] args) {
        String h = "hello";
        System.out.println(h.substring());


        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(70);
        bst.insert(50);
        bst.insert(90);
        bst.insert(30);
        bst.insert(60);
        bst.insert(20);
        bst.insert(40);
        bst.insert(80);
        bst.insert(100);
//        bst.inOrderTraversal(bst.root);
//        System.out.println();
//        bst.preOrderTraversal(bst.root);
//        System.out.println();
//        bst.postOrderTraversal(bst.root);
//        System.out.println( );
        bst.levelOrderTraversal(bst.root);
        bst.search(bst.root,40);
    }
}
