package com.shakir;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTreeTest {

    @org.junit.jupiter.api.Test
    void insert() {

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
        //bst.inOrderTraversal();
    }
}