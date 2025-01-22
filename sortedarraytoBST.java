/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rida
 */
public class sortedarraytoBST {
    static class Node {
        int value;
        Node left, right;

        Node(int value) {
            this.value = value;
            left = right = null;
        }
    }

    public static Node sortedArrayToBST(int[] arr, int start, int end) {
        if (start > end) return null;

        int mid = (start + end) / 2;
        Node node = new Node(arr[mid]);

        node.left = sortedArrayToBST(arr, start, mid - 1);
        node.right = sortedArrayToBST(arr, mid + 1, end);

        return node;
    }

    public static void preorderTraversal(Node node) {
        if (node == null) return;

        System.out.print(node.value + " ");
        preorderTraversal(node.left);
        preorderTraversal(node.right);
    }

    public static void main(String[] args) {
        int[] sortedArray = {1, 2, 3, 4, 5, 6, 7};
        Node root = sortedArrayToBST(sortedArray, 0, sortedArray.length - 1);

        System.out.println("Preorder Traversal of BST:");
        preorderTraversal(root);
    }
}

