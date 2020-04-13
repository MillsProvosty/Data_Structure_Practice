package BinaryTree;

public class Tree {

    public Tree(Node node) {

    }

    static class Node {
        int value;
        Node left, right;

        Node(int value) {
            this.value = value;
            left = null;
            right = null;
        }
    }

    public void insert(Node node, int value) {
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
    }

    public void traverseInOrder(Node node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.value);
            traverseInOrder(node.right);
        }
    }


    public Node deleteNode(Node node, int value) {
        if (value < node.value) {
            node.left = deleteNode(node.left, value);
        } else if (value > node.value) {
            node.right = deleteNode(node.right, value);
        } else {
            if (node.left == null) {
                return node.right;
            } else if (node.right == null) {
                return node.left;
            }
        }
        return node;
    }
}