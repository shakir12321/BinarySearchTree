package com.shakir;

import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {
    public BinaryNode root;


    public BinarySearchTree() {

        root = new BinaryNode();
    }

    public void insert(int value) {
        insert(this.root, value);
    }

    private BinaryNode insert(BinaryNode currentNode, int value) {

        if (currentNode == null) {
            BinaryNode newNode = new BinaryNode();
            newNode.value = value;
            System.out.println("New node created");
            return newNode;
        } else if (value < currentNode.value) {
            currentNode.left = insert(currentNode.left, value);
            //   System.out.println("Inserted successfully");
            return currentNode;
        } else if (value >= currentNode.value) {
            currentNode.right = insert(currentNode.right, value);
            //    System.out.println("Inserted successfully");
            return currentNode;
        }
        return currentNode;

    }

    public BinaryNode search(BinaryNode currentNode, int value) {

        if (currentNode == null) {
            System.out.println("Item notfound");
            return null;
        } else if (currentNode.value == value) {
             System.out.println("Item found");
            return null;
        } else if (value < currentNode.value) {
            currentNode.left = search(currentNode.left, value);
            //   System.out.println("Inserted successfully");
           // return currentNode;
        } else if (value >= currentNode.value) {
            currentNode.right = search(currentNode.right, value);
            //    System.out.println("Inserted successfully");
         //   return currentNode;
        }
        return currentNode;

    }
    public void inOrderTraversal(BinaryNode currentNode) {
         if (currentNode == null) {
            return;
        }
             inOrderTraversal(currentNode.left);
            System.out.print(currentNode.value + " -> ");
            inOrderTraversal(currentNode.right);
         }

    public void preOrderTraversal(BinaryNode currentNode) {
        if (currentNode == null) {
            return;
        }
        System.out.print(currentNode.value + " -> ");
        preOrderTraversal(currentNode.left);
        preOrderTraversal(currentNode.right);
    }

    public void postOrderTraversal(BinaryNode currentNode) {
        if (currentNode == null) {
            return;
        }
        postOrderTraversal(currentNode.left);
        postOrderTraversal(currentNode.right);
        System.out.print(currentNode.value + " -> ");

    }

    public void levelOrderTraversal(BinaryNode rootNode) {
        if (rootNode == null) {
            return;
        }
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(rootNode);
        while (!queue.isEmpty()) {
            BinaryNode currentNode = queue.remove();
            System.out.print(currentNode.value + " -> ");
            if(currentNode.left !=null) queue.add(currentNode.left);
            if(currentNode.right !=null) queue.add(currentNode.right);
        }

    }

}

