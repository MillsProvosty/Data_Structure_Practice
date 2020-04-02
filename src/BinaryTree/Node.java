package BinaryTree;

public class Node {
    int value;
        Node left, right;
        Node(int value){
            this.value = value;
            left = null;
            right = null;
        }

        public void insert(Node node, int value){
            if (value < node.value) {
                if (node.left != null) {
                    insert(node.left, value);
                } else {
                    node.left = new Node(value);
                }
            } else if (value > node.value){
                    if (node.right != null) {
                        insert(node.right, value);
                    } else {
                        node.right = new Node(value);
                }
            }
        }
}
