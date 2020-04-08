package BinaryTree;

import static jdk.nashorn.internal.objects.NativeMap.delete;

public class Tree {
    private Node root;

    public boolean isEmpty() {
        return this.root == null;
    }

    public Tree(Node node) {

    }

    static class Node {
        int value;
        Node left, right;

        Node(int value){
            this.value = value;
            left = null;
            right = null;
        }
    }

    public Node getRoot() {
        return this.root;
    }

    public void insert(Node node, int value) {
        if (!this.isEmpty()) {
            if (value < node.value) {
                if (node.left != null) {
                    System.out.println("Inserted " + value + " to the left of " + node.value);
                    insert(node.left, value);
                } else {
                    System.out.println("Created new node " + value + " to left of " + node.value);
                    node.left = new Node(value);
                }
            } else if (value > node.value) {
                if (node.right != null) {
                    System.out.println("Inserted " + value + " to the right of " + node.value);

                    insert(node.right, value);
                } else {
                    System.out.println("Created new node " + value + " to right of " + node.value);
                    node.right = new Node(value);
                }
            }
        } else {
            root = new Node(value);
        }
    }
    public void traverseInOrder(Node node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.value);
            traverseInOrder(node.right);
        }
    }


    public void deleteNode(Node node, int value) {
        do {
            traverseInOrder(node);
        } while(value == node.value); {
                delete(node, value);
            }
    }
}
