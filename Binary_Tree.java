/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Rida
 */
class Node
{
    int key;
    Node left, right;
    
    public Node(int item)
    {
        key = item;
        left = right = null;
    }
}

public class Binary_Tree{
    Node root;
    Binary_Tree(int key){
        root = new Node (key);
    }
    
    Binary_Tree()
    {
        root = null;
    }
void printPreorder(Node node)
{
if (node == null)
return;

System.out.print(node.key + " ");
printPreorder(node.left);
printPreorder(node.right);}

void printInorder(Node node)
{
if (node == null)
return;

printInorder(node.left);
System.out.print(node.key + " ");
printInorder(node.right);
}

void printPostorder(Node node){
if (node == null)
return;

printPostorder(node.left);
printPostorder(node.right);
System.out.print(node.key + " ");
}

public static void main (String[] args){
Binary_Tree tree = new Binary_Tree();
tree.root = new Node (1);
Node a = new Node(2);
tree.root.left = a;
Node b = new Node (3);
tree.root.right = b;

a.left = new Node(4);
a.right = new Node (5);

    System.out.println("Pre-Order");
    tree.printPreorder(tree.root);
    System.out.println("\nPost-Order");
    tree.printPostorder(tree.root);
    System.out.println("\nIn-Order");
    tree.printInorder(tree.root);
}
}
