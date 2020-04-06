package BinaryTree;

public class Node {
    int value;
        Node left, right;
        Node(int value){
            this.value = value;
            left = null;
            right = null;
        }

        public void insert(Node node, int value) {
            if (value > node.value) {
                if (node.left != null) {
                    System.out.println("Inserted " + value + " to left of " + node.value);
                    insert(node.left, value);
                } else {
                    System.out.println("Inserted " + value + " to right of " + node.value);
                    node.left = new Node(value);
                }
            } else if (value < node.value) {
                if (node.right != null) {
                    System.out.println("Right's not null, inserting here");
                    insert(node.right, value);
                } else
                    System.out.println("Right's was null, creating new node");
                node.right = new Node(value);
            }
        }

        public void traverseInOrder(Node node) {
            if (node != null) {
                traverseInOrder(node.left);
                System.out.print(" " + node.value);
                traverseInOrder(node.right);
                System.out.print(" " + node.value);
            }
    }
}
