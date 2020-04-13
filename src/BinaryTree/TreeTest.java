package BinaryTree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

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
                assertEquals(node2.right.value, 60);
                assertEquals(node2.left.value, 40);
                assertNotEquals(node2.right.value, 40);
                assertNotEquals(node2.left.value, 60);
        }

        @Test
        void canNodesBeTraversed() {

                //given
                final Tree.Node node3 = new Tree.Node(50);
                final Tree tree3 = new Tree(node3);

                //when
                tree3.insert(node3,10);
                tree3.insert(node3,20);
                tree3.insert(node3,30);
                tree3.insert(node3,40);
                tree3.insert(node3,60);
                tree3.insert(node3,70);
                tree3.insert(node3,80);
                tree3.insert(node3,90);
                tree3.insert(node3,100);

                //then
                tree3.traverseInOrder(node3);
        }


        @Test
        void canDeleteNode() {
                //given
                final Tree.Node node4 = new Tree.Node(50);
                final Tree tree4 = new Tree(node4);


                //when
                tree4.insert(node4,10);
                tree4.insert(node4,20);
                tree4.insert(node4,30);
                tree4.insert(node4,40);
                tree4.insert(node4,60);
                tree4.insert(node4,70);
                tree4.insert(node4,80);
                tree4.insert(node4,90);
                tree4.insert(node4,100);
                tree4.traverseInOrder(node4);
                tree4.deleteNode(node4, 100);

                tree4.traverseInOrder(node4);

                tree4.deleteNode(node4, 30);
                tree4.traverseInOrder(node4);
        }


}