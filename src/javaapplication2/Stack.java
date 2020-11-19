
package javaapplication2;



class Node
{
    int data;
    Node next;
    public Node( int data, Node next )
    {
        this.data = data;
        this.next = next;
    }
}
        
        
public class Stack
{
    Node top = null;
    
    void push(int data)
    {
        Node n = new Node( data, top );
        
        top = n;
    }
    int pop()
    {
        if ( !isEmpty() )
        {
            int res = top.data;
            top = top.next;
            return res;
        }
        return 0;
    }
    boolean isEmpty()
    {
        return top==null;
    }
    
    
}
