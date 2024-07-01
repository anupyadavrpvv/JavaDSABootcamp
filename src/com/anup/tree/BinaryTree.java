package com.anup.tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        root.right.left = new Node(60);
        root.right.right = new Node(70);
        root.left.left.left = new Node(80);

        System.out.print("Inorder-traversal: ");
        inOrderTraversal(root);
        System.out.println();
        System.out.print("Preorder-traversal: ");
        preOrderTraversal(root);
        System.out.println();
        System.out.print("Postorder-traversal: ");
        postOrderTraversal(root);
        System.out.println();
        System.out.print("Level-order-traversal(BFS): ");
        levelOrderTraversal(root);
        System.out.println();
        System.out.println("Height of the Binary Tree: "+heightOfTree(root));
        int k = 2;
        System.out.print("Nodes at distance "+k+" from root are = ");
        printNodeAtKDistance(root, k);
        System.out.println();
        System.out.println("Size of the binary tree : "+sizeOfBinaryTree(root));
        System.out.println("Max in Binary Tree is: "+maxInBinaryTree(root));
    }

    static void inOrderTraversal(Node root){
        if (root != null){
            inOrderTraversal(root.left);
            System.out.print(root.value + " ");
            inOrderTraversal(root.right);
        }
    }

    static void preOrderTraversal(Node root){
        if (root != null){
            System.out.print(root.value + " ");
            preOrderTraversal(root.left);
            preOrderTraversal(root.right);
        }
    }

    static void postOrderTraversal(Node root){
        if (root != null){
            postOrderTraversal(root.left);
            postOrderTraversal(root.right);
            System.out.print(root.value + " ");
        }
    }

    static void levelOrderTraversal(Node root){
        if (root == null) return;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            Node curr = queue.poll();
            System.out.print(curr.value +" ");
            if(curr.left != null) queue.add(curr.left);
            if(curr.right != null) queue.add(curr.right);
        }
    }

    static int heightOfTree(Node root){
        if(root == null) return 0;
        return Math.max(heightOfTree(root.left), heightOfTree(root.right)) + 1;
    }

    static void printNodeAtKDistance(Node root, int k){
        if (root == null) return;
        if (k == 0) System.out.print(root.value +" ");
        else{
            printNodeAtKDistance(root.left, k - 1);
            printNodeAtKDistance(root.right, k - 1);
        }
    }

    static int sizeOfBinaryTree(Node root){
        if(root == null) return 0;
        return 1 + sizeOfBinaryTree(root.left) + sizeOfBinaryTree(root.right);
    }

    static int maxInBinaryTree(Node root){
        if(root == null) return Integer.MIN_VALUE;
        return Math.max(root.value, Math.max(maxInBinaryTree(root.left), maxInBinaryTree(root.right)));
    }
}
