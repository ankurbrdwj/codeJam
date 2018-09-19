package com.ankur.practice.trees;

import java.util.Comparator;

public class BinarySearchTree<A extends Comparable<A>> {

    private Node<A> root;
    private Comparator<A> comparator;
    public BinarySearchTree(A value) {
        root = new Node<A>(value);
    }

    public BinarySearchTree()
    {
        root = null;
        comparator = null;
    }

    public BinarySearchTree(Comparator<A> comp)
    {
        root = null;
        comparator = comp;
    }

    public Node<A> getRoot() {
        return root;
    }

    public void setRoot(Node<A> root) {
        this.root = root;
    }

    private int compare(A x, A y)
    {
        if(comparator == null) return x.compareTo(y);
        else
            return comparator.compare(x,y);
    }

    /*****************************************************
     *            INSERT
     ******************************************************/
    public void insert(A data)
    {
        root = insert(root, data);
    }
    private Node<A> insert(Node<A> p, A toInsert)
    {
        if (p == null)
            return new Node<A>(toInsert);

        if (compare(toInsert, p.data) == 0)
            return p;

        if (compare(toInsert, p.data) < 0)
            p.left = insert(p.left, toInsert);
        else
            p.right = insert(p.right, toInsert);

        return p;
    }


    public int getHeight(Node root) {
        if (root == null) {
            return 0;
        }
       return Math.max(getHeight(root.left),getHeight(root.right)+1);
    }

    public boolean isEmpty() {

        return (this.root == null);
    }

    public boolean isBalanced(Node root){
        if(root == null){
            return true;
        }
        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);

        if (Math.abs(leftHeight-rightHeight)>1 && isBalanced(root.left) && isBalanced(root.right)){
            return true;
        }
        return false;
    }

}

class Node<T extends Comparable<T>>{
    T data;
    Node<T> left;
    Node<T> right;

    public Node() {
        this.data = null;
        this.left = null;
        this.right= null;
    }

    public Node(T data) {
        this.data = data;
        this.left = null;
        this.right= null;
    }

    public Node(T data, Node<T> left, Node<T> right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}