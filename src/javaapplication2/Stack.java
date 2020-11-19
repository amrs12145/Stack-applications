
package javaapplication2;



class Node
{
    int data;
    Node next;
    public Node(int d)
    {
        data = d;
        next = null;
    }
}
        
        
public class Stack
{
    Node top = null;
    
    void push(int num)
    {
        Node n = new Node(num);
        top = n;
        n.next = top;
    }
    
    
}
