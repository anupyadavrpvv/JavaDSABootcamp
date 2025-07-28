package com.anup.tree;

import java.util.*;

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
        System.out.print("Inorder-traversal Iterative: ");
        inOrderTraversalIterative(root);
        System.out.println();
        System.out.print("Preorder-traversal: ");
        preOrderTraversal(root);
        System.out.println();
        System.out.print("Preorder-traversal Iterative: ");
        preOrderTraversalIterative(root);
        System.out.println();
        System.out.print("Postorder-traversal: ");
        postOrderTraversal(root);
        System.out.println();
        System.out.print("Postorder-traversal Iterative 2 stacks: ");
        postOrderTraversalIterative2Stacks(root);
        System.out.println();
        System.out.print("Postorder-traversal Iterative 1 stack: ");
        postOrderTraversalIterative1Stack(root);
        System.out.println();
        System.out.print("Level-order-traversal(BFS): ");
        levelOrderTraversal(root);
        System.out.println();
        System.out.print("Level-order-traversal(BFS) List: ");
        List<List<Integer>> lists = getLevelOrderTraversalList(root);
        System.out.print(lists);
        System.out.println();
        System.out.print("Left-side-view:::List: ");
        System.out.print(leftSideView(root));
        System.out.println();
        System.out.print("Right-side-view:::List: ");
        System.out.print(rightSideView(root));
        System.out.println();
        System.out.print("Boundary-view:::List: ");
        System.out.print(boundary(root));
        System.out.println();
        System.out.print("Vertical-order-traversal:::List: ");
        System.out.print(verticalTraversal(root));
        System.out.println();
        System.out.println("Height of the Binary Tree: "+heightOfTree(root));
        int k = 2;
        System.out.print("Nodes at distance "+k+" from root are = ");
        printNodeAtKDistance(root, k);
        System.out.println();
        System.out.println("Size of the binary tree : "+sizeOfBinaryTree(root));
        System.out.println("Max in Binary Tree is: "+maxInBinaryTree(root));
        List<List<Integer>> allTraversalList = preInPostTraversal(root);
        System.out.println(allTraversalList);
    }

    static void inOrderTraversal(Node root){
        if (root != null){
            inOrderTraversal(root.left);
            System.out.print(root.value + " ");
            inOrderTraversal(root.right);
        }
    }
    static void inOrderTraversalIterative(Node root){
        Stack<Node> stack = new Stack<>();
        Node curr = root;
        while(curr != null || !stack.isEmpty()){
            while(curr != null){
                stack.push(curr);
                curr = curr.left;
            }
            curr = stack.pop();
            System.out.print(curr.value + " ");
            curr = curr.right;
        }
    }
    static void preOrderTraversal(Node root){
        if (root != null){
            System.out.print(root.value + " ");
            preOrderTraversal(root.left);
            preOrderTraversal(root.right);
        }
    }

    static void preOrderTraversalIterative(Node root){
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            Node curr = stack.pop();
            System.out.print(curr.value + " ");
            if(curr.right != null) stack.push(curr.right);
            if(curr.left != null) stack.push(curr.left);
        }
    }

    static void postOrderTraversal(Node root){
        if (root != null){
            postOrderTraversal(root.left);
            postOrderTraversal(root.right);
            System.out.print(root.value + " ");
        }
    }

    static void postOrderTraversalIterative2Stacks(Node root){
        Stack<Node> st1 = new Stack<>();
        Stack<Node> st2 = new Stack<>();
        st1.push(root);
        while(!st1.isEmpty()){
            Node curr = st1.pop();
            st2.add(curr);
            if(curr.left != null) st1.add(curr.left);
            if(curr.right != null) st1.add(curr.right);
        }
        while(!st2.empty()){
            System.out.print(st2.pop().value + " ");
        }
    }

    public static void postOrderTraversalIterative1Stack(Node root) {
        if (root == null) return;
        Stack<Node> stack = new Stack<>();
        Node current = root;
        Node lastVisited = null;

        while (current != null || !stack.isEmpty()) {
            if (current != null) {
                stack.push(current);
                current = current.left;
            } else {
                Node peekNode = stack.peek();
                if (peekNode.right != null && lastVisited != peekNode.right) {
                    current = peekNode.right;
                } else {
                    System.out.print(peekNode.value + " ");
                    lastVisited = stack.pop();
                }
            }
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

    public static List<List<Integer>> getLevelOrderTraversalList(Node root){
        List<List<Integer>> result = new ArrayList<>();
        if(root == null) return result;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            List<Integer> list = new ArrayList<>();
            int qLength = q.size();
            while(qLength > 0){
                Node curr = q.poll();
                list.add(curr.value);
                if(curr.left != null) q.add(curr.left);
                if(curr.right != null) q.add(curr.right);
                qLength--;
            }
            result .add(list);
        }
        return result;
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

    // Function to get the Preorder,
    // Inorder and Postorder traversal
    // Of Binary Tree in One traversal
    public static List<List<Integer>> preInPostTraversal(Node root) {

        List<Integer> pre = new ArrayList<>();
        List<Integer> in = new ArrayList<>();
        List<Integer> post = new ArrayList<>();

        if (root == null) return new ArrayList<>();

        Stack<Pair<Node, Integer>> st = new Stack<>();
        st.push(new Pair<>(root, 1));

        while (!st.empty()) {
            Pair<Node, Integer> curr = st.pop();

            // state 1 (preorder)
            if (curr.getValue() == 1) {
                pre.add(curr.getKey().value);
                curr.setValue(2);
                st.push(curr);
                if (curr.getKey().left != null) {
                    st.push(new Pair<>(curr.getKey().left, 1));
                }
            }
            // state 2 (inorder)
            else if (curr.getValue() == 2) {
                in.add(curr.getKey().value);
                curr.setValue(3);
                st.push(curr);
                if (curr.getKey().right != null) {
                    st.push(new Pair<>(curr.getKey().right, 1));
                }
            }
            // state 3 (postorder)
            else {
                post.add(curr.getKey().value);
            }
        }
        List<List<Integer>> result = new ArrayList<>();
        result.add(pre);
        result.add(in);
        result.add(post);
        return result;
    }

    public static List<List<Integer>> leftSideView(Node root){
        List<List<Integer>> result = new ArrayList<>();
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            List<Integer> list = new ArrayList<>();
            int size = q.size();
            boolean first = true;
            while(!q.isEmpty() && size > 0){
                size--;
                Node curr = q.poll();
                if(first){
                    list.add(curr.value);
                    first = false;
                }
                if(curr.left != null) q.add(curr.left);
                if(curr.right != null) q.add(curr.right);
            }
            result.add(list);
        }
        return result;
    }

    public static List<List<Integer>> rightSideView(Node root){
        List<List<Integer>> result = new ArrayList<>();
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            List<Integer> list = new ArrayList<>();
            int size = q.size();
            while(!q.isEmpty() && size > 0){
                size--;
                Node curr = q.poll();
                if(size == 0){
                    list.add(curr.value);
                }
                if(curr.left != null) q.add(curr.left);
                if(curr.right != null) q.add(curr.right);
            }
            result.add(list);
        }
        return result;
    }

    static ArrayList<Integer> boundary(Node root)
    {
        ArrayList<Integer> list = new ArrayList<>();
        //left boundary
        leftBoundary(root, list);

        //leaf boundary
        leafBoundary(root, list);

        //right boundary
        Stack<Integer> st = new Stack<>();
        rightBoundary(root.right, st);
        list.addAll(st);

        return list;
    }

    private static void rightBoundary(Node root, Stack<Integer> st) {
        if(root == null) return;
        if(root.left != null || root.right != null) st.push(root.value);
        if(root.right != null)
            rightBoundary(root.right, st);
    }

    private static void leafBoundary(Node root, List<Integer> list) {
        if(root == null) return;
        if(root.left == null && root.right == null) list.add(root.value);
        if(root.left != null)
            leafBoundary(root.left, list);
        if(root.right != null)
            leafBoundary(root.right, list);
    }

    private static void leftBoundary(Node root, List<Integer> list) {
        if(root == null) return;
        if(root.left != null || root.right != null) list.add(root.value);
        if(root.left != null)
            leftBoundary(root.left, list);
        else
            leftBoundary(root.right, list);
    }

    static class PairArray{
        Node node;
        Integer level;
        PairArray(Node node, Integer level){
            this.node = node;
            this.level = level;
        }
    }
    public static List<List<Integer>> verticalTraversal(Node root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root == null) return result;
        Map<Integer, List<Integer>> map = new TreeMap<>();
        Queue<PairArray> q = new LinkedList<>();
        q.add(new PairArray(root, 0));
        while(!q.isEmpty()){
            int size = q.size();
            while(!q.isEmpty() && size > 0){
                PairArray pair = q.poll();
                Node curr = pair.node;
                Integer lev = pair.level;
                size--;
                if(map.containsKey(lev)){
                    map.get(lev).add(curr.value);
                } else{
                    List<Integer> list = new ArrayList<>();
                    list.add(curr.value);
                    map.put(lev, list);
                    if(curr.left != null) q.add(new PairArray(curr.left, lev - 1));
                    if(curr.right != null) q.add(new PairArray(curr.right, lev + 1));
                }
            }
        }
        for(Map.Entry<Integer, List<Integer>> m : map.entrySet()){
//            System.out.print("printing map values::"+m + "::::");
            result.add(m.getValue().stream().toList());
        }
        return result;
    }

}
