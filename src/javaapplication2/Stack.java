
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
    // By mobile


int peek()
{
return top.data;
}

Stack tmp = new Stack();

boollean(int data)
{
while( !isEmpty() )
 {
  if ( top.data == data )
     return true;
  else
  {
    tmp.push( pop() );
  }
 }

while( tmp.top != null  )
{
push( tmp.pop() );
}

return false;
}
    

    
    
}
