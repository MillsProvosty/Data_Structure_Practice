package BinaryTree;

import org.junit.jupiter.api.Test;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Node;
import static org.junit.jupiter.api.Assertions.*;

class TreeTest {
        @Test
        void doesNodeAndValueExist() {
                //given
                final Tree.Node node1 = new Tree.Node(50);
                final Tree tree1 = new Tree(node1);

                //when

                //then
                assertEquals(node1.value, 50);
        }

        @Test
        void canNodesBeAdded() {
                //given
                final Tree.Node node2 = new Tree.Node(50);
                final Tree tree2 = new Tree(node2);

                //when
                tree2.insert(node2,40);
                tree2.insert(node2,60);

                //then
                assertEquals(node2.value, 50);
                assertEquals(node2.right.value, 40);
                assertEquals(node2.left.value, 60);
                assertNotEquals(node2.right.value, 60);
                assertNotEquals(node2.left.value, 40);
        }

//        @Test
//        void canNodesBeTraversed() {
//
//                //given
//                final Tree.Node node3 = new Tree.Node(50);
//                final Tree tree3 = new Tree(node3);
//
//
//                //when
//                tree3.insert(node3,10);
//                tree3.insert(node3,20);
//                tree3.insert(node3,30);
//                tree3.insert(node3,40);
//                tree3.insert(node3,60);
//
//
//                //then
//                node3.traverseInOrder(node3);
//        }

//        @Test
//        void doesTreeExist() {
//           //given
//           final Tree tree1 = new Tree(node)
//        }
//
//        tree.insert(root, 2);
//        tree.insert(root, 4);
//        tree.insert(root, 8);
//        tree.insert(root, 6);
//        tree.insert(root, 7);
//        tree.insert(root, 3);
//        tree.insert(root, 9);
//        System.out.println("Traversing tree in order");
//        tree.traverseLevelOrder();
}