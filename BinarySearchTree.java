/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab09;

/**
 *
 * @author Rida
 */
class Node {
    int key;
    Node left, right;

    public Node(int item) {
        key = item;
        left = right = null;
    }
}

class BST {
    Node root;

    BST(int key) {
        root = new Node(key);
    }

    BST() {
        root = null;
    }

    void printPostorder(Node node) {
        if (node == null)
            return;

        printPostorder(node.left);
        printPostorder(node.right);
        System.out.print(node.key + " ");
    }

    void printInorder(Node node) {
        if (node == null)
            return;

        printInorder(node.left);
        System.out.print(node.key + " ");
        printInorder(node.right);
    }

    void printPreorder(Node node) {
        if (node == null)
            return;

        System.out.print(node.key + " ");
        printPreorder(node.left);
        printPreorder(node.right);
    }

    public Node search(Node root, int key) {
        if (root == null || root.key == key) {
            return root;
        }

        if (root.key > key) {
            return search(root.left, key);
        } else {
            return search(root.right, key);
        }
    }

    Node insertRec(Node root, int key) {
        if (root == null) {
             System.out.println("\nInserting key: " + key);
            root = new Node(key);
            return root;
        }
        if (key < root.key) {
            root.left = insertRec(root.left, key);
        } else if (key > root.key) {
            root.right = insertRec(root.right, key);
        }
        return root;
    }
}

// Main class for creating and testing the BST
public class BinarySearchTree {
    public static void main(String[] args) {
        BST tree = new BST();

        tree.root = new Node(8);

        Node a = new Node(3);
        tree.root.left = a;
        Node b = new Node(10);
        tree.root.right = b;

        a.left = new Node(1);
        a.right = new Node(6);

        b.left = new Node(9);
        b.right = new Node(14);

        System.out.println("Pre-Order:");
        tree.printPreorder(tree.root);
        System.out.println("\n\nPost-Order:");
        tree.printPostorder(tree.root);
        System.out.println("\n\nIn-Order:");
        tree.printInorder(tree.root);

        // Inserting a node
        tree.root = tree.insertRec(tree.root, 20);

        // Searching a node
        Node result = tree.search(tree.root, 20);
        if (result != null) {
            System.out.println("\n\nNode found: " + result.key);
        } else {
            System.out.println("\n\nNode not found");
        }
    }
}
