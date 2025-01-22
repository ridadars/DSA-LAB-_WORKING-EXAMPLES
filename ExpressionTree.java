/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rida
 */
class ExpressionTree {
    static class Node {
        char value;
        Node left, right;

        Node(char value) {
            this.value = value;
            left = right = null;
        }
    }

    public static Node buildExpressionTree() {
        Node root = new Node('/');
        root.left = new Node('*');
        root.right = new Node('+');

        root.left.left = new Node('+');
        root.left.right = new Node('-');
        root.right.left = new Node('2');
        root.right.right = new Node('9');

        root.left.left.left = new Node('5');
        root.left.left.right = new Node('2');

        root.left.right.left = new Node('2');
        root.left.right.right = new Node('1');

        return root;
    }

    public static void inorderTraversal(Node node) {
        if (node == null) return;

        inorderTraversal(node.left);
        System.out.print(node.value + " ");
        inorderTraversal(node.right);
    }

    public static void main(String[] args) {
        Node root = buildExpressionTree();
        System.out.println("Inorder Traversal of Expression Tree:");
        inorderTraversal(root);
    }
}

