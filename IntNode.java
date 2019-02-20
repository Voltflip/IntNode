// CS 272 Intro to Data Structures
// Program Name: IntNode.java
// Author: Voltflip
// Date: 02/12/2019
// Purpose: The purpose of this program is to implement and understand nodes and linked lists
//          and writing methods to modify the nodes and their values

public class IntNode {

    private int data;
    private IntNode next;

    public IntNode() {
        this.data = 0;
        this.next = null;
    } // end IntNode default constructor method

    public IntNode (int _data, IntNode _node) {
        this.data = _data;
        this.next = _node;
    } // end IntNode constructor method that takes an int and node as parameters and sets the instance vars equal to them

    public int getData() {
        return data;
    } // returns the value of intValue

    public IntNode getLink() {
        return next;
    } // returns the value of instance variable next

    public void setData(int newData) {
        this.data = newData;
    } // sets the value of instance variable intValue to whatever int is passed as the argument

    public void setLink(IntNode newLink) {
        this.next = newLink;
    } // sets the value of instance variable link to whatever is passed as the argument

    public static int listLength(IntNode head) {
        int count = 1;
        if (head.next == null) {
            return count;
         } // end if statement
        else {
            IntNode current = head;
            while (current.next != null) {
                current = current.next;
                count += 1;
            } // end while loop
        } // end else
        return count;
    } // end listLength method

    public String toString() {
        String linkedList = "";
        
        IntNode current = this;
        while (current.next != null) {
           linkedList = linkedList + current.data + "->";
           current = current.next;
        } // end while loop
        if (current.next == null)
           linkedList = linkedList + current.data;
        return linkedList;
    }
    // returns a String

    public void addNodeAfterThis(int newData) {
        IntNode node = new IntNode();
        node.data = newData;
        node.next = this.next;
        this.next = node;
    } // adds a new node by creating one, then assigns the newData to it's data 
      // instance variable and redirects next pointers properly

    // @precondition - head must NOT be null
    public static boolean search(IntNode head, int data) {
        IntNode current = head;
        while (current.next != null) {
            if (current.data == data) return true;
            current = current.next;
        } // end while loop
        return false;
    }

    public void removeNodeAfterThis() {
        this.next = next.next;
    } // reassigns the pointer of whatever node calls this method to skip over the next node, since
      // nothing points to the middle node anymore it is garbage collected

} // end IntNode class
