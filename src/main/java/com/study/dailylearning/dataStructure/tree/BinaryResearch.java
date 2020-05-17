package com.study.dailylearning.dataStructure.tree;

import java.nio.BufferUnderflowException;

/**
 *
 * @description:
 * @create: 2020-04-11
 **/
public class BinaryResearch<T extends Comparable<? super T>> {
    public static void main(String[] args) {
        BinaryResearch binaryResearch = new BinaryResearch();
        binaryResearch.rootNode = binaryResearch.init();
        binaryResearch.printTree(binaryResearch.rootNode);
        System.out.println();
        binaryResearch.remove(10);
        binaryResearch.printTree(binaryResearch.rootNode);
        System.out.println();
    }


    // 初始化二叉树
    public static Node<Integer> init() {
        Node<Integer> D = new Node<>(4, null, null);
        Node<Integer> H = new Node<>(8, null, null);
        Node<Integer> I = new Node<>(9, null, null);
        Node<Integer> J = new Node<>(10, null, null);
        Node<Integer> P = new Node<>(16, null, null);
        Node<Integer> G = new Node<>(7, null, P);
        Node<Integer> F = new Node<>(6, null, J);
        Node<Integer> E = new Node<>(5, H, I);

        Node<Integer> B = new Node<>(2, D, E);
        Node<Integer> C = new Node<>(11, F, G);
        Node<Integer> A = new Node<>(1, B, C);
        return A;
    }



    private static class Node<T> {
        T data;
        Node<T> leftNode;
        Node<T> rightNode;

        public Node(T data) {
            this(data, null, null);
        }

        public Node(T data, Node leftNode, Node rightNode) {
            this.data = data;
            this.leftNode = leftNode;
            this.rightNode = rightNode;
        }
    }
    

    Node<T> rootNode;


    public BinaryResearch() {
        this.rootNode = null;
    }


    public void makeEmpty() {
        rootNode = null;
    }

    public boolean isEmpty() {
        return null == rootNode;
    }


    public boolean contains(T data) {
        return contains(data, rootNode);
    }


    public void insert(T data) {
        rootNode = insert(data, rootNode);
    }

    public void remove(T data) {
        rootNode = remove(data, rootNode);
    }


    //删除就是先遍历找出要删除的那个元素,再进行删除
    private Node<T> remove(T data, Node<T> rootNode) {
        if (rootNode == null) {
            return rootNode;
        }
        int compare = data.compareTo(rootNode.data);
        if (compare < 0) {
            rootNode.leftNode = remove(data, rootNode.leftNode);
        } else if (0 < compare) {
            rootNode.rightNode = remove(data, rootNode.rightNode);
        } else if (rootNode.leftNode != null && rootNode.rightNode != null) {
            //two child
            rootNode.data = findMin(rootNode.rightNode).data;
            rootNode.rightNode = remove(rootNode.data, rootNode.rightNode);
        } else {
            rootNode = (rootNode.leftNode != null) ? rootNode.leftNode : rootNode.rightNode;
        }
        return rootNode;

    }


    public void printTree(Node<T> rootNode) {
        if (null != rootNode) {
            printTree(rootNode.leftNode);
            System.out.print(rootNode.data+",");
            printTree(rootNode.rightNode);
        }
    }

    public T findMin() {
        if (isEmpty()) {
            throw new BufferUnderflowException();
        }
        return findMin(rootNode).data;
    }


    public T findMax() {
        if (isEmpty()) {
            throw new BufferUnderflowException();
        }
        return findMax(rootNode).data;
    }

    private Node<T> findMax(Node<T> rootNode) {
        if (null == rootNode) {
            return null;
        } else if (rootNode.rightNode == null) {
            return rootNode;
        } else {
            return findMax(rootNode.rightNode);
        }

    }

    public Node<T> findMin(Node<T> rootNode) {
        if (null == rootNode) {
            return null;
        } else if (rootNode.leftNode == null) {
            return rootNode;
        } else {
            return findMin(rootNode.leftNode);
        }

    }



    private Node<T> insert(T data, Node<T> rootNode) {
        if (rootNode == null) {
            return new Node<>(data);
        }
        int compare = data.compareTo(rootNode.data);
        if (compare < 0) {
            rootNode.leftNode = insert(data,rootNode.leftNode);
        } else if (compare > 0) {
            rootNode.rightNode = insert(data,rootNode.rightNode);
        } else {

        }
        return null;
    }


    private boolean contains(T data, Node<T> rootNode) {
        if (null==rootNode) {
            return false;
        }
        int compare = data.compareTo(rootNode.data);
        if (compare < 0) {
            return contains(data, rootNode.leftNode);
        } else if (compare > 0) {
            return contains(data, rootNode.rightNode);
        } else {
            return true;
        }
    }


}

