package com.ankur.practice.trees;

public class BalancedTree {
    public static void main(String[] args) {
        BinarySearchTree<Integer> bst = new BinarySearchTree<>();
        Node<Integer> root = new Node<>(100);
        bst.setRoot(root);
        int[] array={120,30,40,110,130,20,50,10,70};
        for(int i:array){
            bst.insert(i);
        }
        BTreePrinter.printNode(bst.getRoot());
        System.out.println(bst.getHeight(bst.getRoot()));
        System.out.println(bst.isBalanced(bst.getRoot()));
        bst.inOrderTraversal(root);
        System.out.println("\n");
        bst.preOrderTraversal(root);
        System.out.println("\n");
        bst.postOrderTraversal(root);
        System.out.println("\n");
        Node root1 = new Node(10);
        root1.left = new Node(6);
        root1.right = new Node(21);
        root1.left.left = new Node(1);
        root1.left.right = new Node(8);
        root1.right.left = new Node(13);
        root1.right.right = new Node(25);
        root1.right.left.left = new Node (12);
        root1.right.left.right = new Node(18);

        bst.depthFirstTraversal(root);
    }
}
