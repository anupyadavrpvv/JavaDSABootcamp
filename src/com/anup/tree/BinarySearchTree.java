package com.anup.tree;

public class BinarySearchTree {
    public static void main(String[] args) {
        Node root = new Node(60);
        insertBST(root,40);
        insertBST(root,50);
        insertBST(root,70);
        insertBST(root,80);
        insertBST(root,90);
        insertBST(root,30);

        System.out.println("Level order traversal of the BST: ");
        bstTraversal(root);
        System.out.println();
        System.out.println("Height of the BST " + BinaryTree.heightOfTree(root));
        int value = 90;
        System.out.println("Search "+value+" in BST = " + searchInBST(root, value));
    }

    static Node insertBST(Node root, int value){
        if(root == null) return new Node(value);
        else if(root.value > value) root.left = insertBST(root.left, value);
        else root.right = insertBST(root.right, value);
        return root;
    }

    static void bstTraversal(Node root){
        if (root == null) return;
        BinaryTree.levelOrderTraversal(root);
    }

    static boolean searchInBST(Node root, int value){
        if(root == null) return false;
        if(root.value == value) return true;
        else if(root.value > value) return searchInBST(root.left, value);
        else return searchInBST(root.right, value);
    }
}
