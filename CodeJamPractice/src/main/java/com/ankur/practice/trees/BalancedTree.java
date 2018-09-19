package com.ankur.practice.trees;

public class BalancedTree {
    public static void main(String[] args) {
        BinarySearchTree<Integer> bst = new BinarySearchTree<>();
        Node<Integer> root = new Node<>(100);
        bst.setRoot(root);
        int[] array={120,30,40,110,130,20,50,10};
        for(int i:array){
            bst.insert(i);
        }
        BTreePrinter.printNode(bst.getRoot());
        System.out.println(bst.getHeight(bst.getRoot()));
        System.out.println(bst.isBalanced(bst.getRoot()));
    }
}
