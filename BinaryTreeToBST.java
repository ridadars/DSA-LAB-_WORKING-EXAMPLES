/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rida
 */
import java.util.ArrayList;
import java.util.Collections;

class BinaryTreeToBST {
    static class Node {
        int value;
        Node left, right;

        Node(int value) {
            this.value = value;
            left = right = null;
        }
    }

    public static void inorderTraversal(Node node, ArrayList<Integer> list) {
        if (node == null) return;

        inorderTraversal(node.left, list);
        list.add(node.value);
        inorderTraversal(node.right, list);
    }

    public static void arrayToBST(Node node, ArrayList<Integer> list) {
        if (node == null) return;

        arrayToBST(node.left, list);
        node.value = list.remove(0);
        arrayToBST(node.right, list);
    }

    public static Node convertToBST(Node root) {
        ArrayList<Integer> list = new ArrayList<>();
        inorderTraversal(root, list);
        Collections.sort(list);
        arrayToBST(root, list);
        return root;
    }

    public static void preorderTraversal(Node node) {
        if (node == null) return;

        System.out.print(node.value + " ");
        preorderTraversal(node.left);
        preorderTraversal(node.right);
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(30);
        root.right = new Node(15);
        root.left.left = new Node(20);
        root.right.right = new Node(5);

        System.out.println("Binary Tree to BST Conversion:");
        root = convertToBST(root);

        System.out.println("Preorder Traversal of Converted BST:");
        preorderTraversal(root);
    }
}
