// CS 272 Intro to Data Structures
// Program Name: IntNode.java
// Author: Voltflip
// Date: 02/12/2019
// Purpose: The purpose of this program is to test the methods in IntNode.java

public class IntNodeTest {

    public static void main (String[] args) {
        
        // create several IntNode objects
        IntNode head = new IntNode();

        IntNode node2 = new IntNode();
        IntNode node3 = new IntNode();
        IntNode node4 = new IntNode();
        
        IntNode node5 = new IntNode(20, null);

        // set next and data instance variables using SetLink and SetData methods
        head.setLink(node2);

        node2.setData(2);
        node2.setLink(node3);

        node3.setData(3);
        node3.setLink(node4);

        node4.setData(4);
        node4.setLink(node5);
        
        //System.out.println(node2.getLink);
        //System.out.println(node2.getData);
        // not sure why these lines were giving me a "cannot find symbol" error
        
        // test and print results of methods defined in IntNode.java file
        
        System.out.println(head.listLength(head));
        
        node3.addNodeAfterThis(7);
        
        System.out.println(head.listLength(head));
        
        System.out.println(head.search(head, 3));
        
        System.out.println(head.toString());
        
        node2.removeNodeAfterThis();
        
        System.out.println(head.toString());

        
    } // end main method
} // end IntNodeTest class
