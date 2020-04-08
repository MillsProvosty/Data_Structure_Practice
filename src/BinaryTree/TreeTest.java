package BinaryTree;

import org.junit.jupiter.api.Test;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Node;
import static org.junit.jupiter.api.Assertions.*;

class TreeTest {
        @Test
        void canReturnNullRoot() {
             //given
             final Tree tree5 = new Tree(null);

             //when
                tree5.getRoot();

             //then
                assertEquals(tree5.getRoot(), null);

        }

        @Test
        void canReturnRoot() {
                //given
                final Tree tree5 = new Tree(null);
                final Tree.Node node5 = new Tree.Node(5);
                final var root = tree5.getRoot();
                //when
                tree5.insert(root, 5);
                tree5.getRoot();

                //then
                assertEquals(tree5.getRoot(), node5);

        }

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
//                //when
//                tree3.insert(node3,10);
//                tree3.insert(node3,20);
//                tree3.insert(node3,30);
//                tree3.insert(node3,40);
//                tree3.insert(node3,60);
//                tree3.insert(node3,70);
//                tree3.insert(node3,80);
//                tree3.insert(node3,90);
//                tree3.insert(node3,100);
//
//                //then
//                tree3.traverseInOrder(node3);
//        }


//        @Test
//        void canDeleteNode() {
//                //given
//                final Tree.Node node4 = new Tree.Node(50);
//                final Tree tree4 = new Tree(node4);
//
//
//                //when
//                tree4.insert(node4,10);
//                tree4.insert(node4,20);
//                tree4.insert(node4,30);
//                tree4.insert(node4,40);
//                tree4.insert(node4,60);
//                tree4.insert(node4,70);
//                tree4.insert(node4,80);
//                tree4.insert(node4,90);
//                tree4.insert(node4,100);
//                tree4.deleteNode(node4, 100);
//
//                tree4.traverseInOrder(node4);
//        }


}