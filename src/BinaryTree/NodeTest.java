package BinaryTree;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.*;

class NodeTest {

    @Test
    void doesNodeAndValueExist() {
        //given
        final Node node1 = new Node(50);
        //when
        //then
        assertEquals(node1.value, 50);
    }

    @Test
    void canNodesBeAdded() {
        //given
        final Node node2 = new Node(50);
        //when
        node2.insert(node2,40);
        node2.insert(node2,60);

        //then
        assertEquals(node2.value, 50);
        assertEquals(node2.right.value, 40);
        assertEquals(node2.left.value, 60);
        assertNotEquals(node2.right.value, 60);
        assertNotEquals(node2.left.value, 40);
    }

    @Test
    void canNodesBeTraversed() {

        //given
        final Node node3 = new Node(50);
        //when
        node3.insert(node3,10);
        node3.insert(node3,20);
        node3.insert(node3,30);
        node3.insert(node3,40);
        node3.insert(node3,60);
        node3.insert(node3,70);
        node3.insert(node3,80);
        node3.insert(node3,90);
        node3.insert(node3,100);

        //then
        node3.traverseInOrder(node3);
    }


}