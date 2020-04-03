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
    void canYouAddNodes() {
        //given
        final Node node2 = new Node(50);
        //when
        node2.insert(node2,40);
        node2.insert(node2,60);

        //then
        assertEquals(node2.value, 50);
        assertEquals(node2.left.value, 40);
        assertEquals(node2.right.value, 60);
        assertNotEquals(node2.left.value, 60);
        assertNotEquals(node2.right.value, 40);


    }


}