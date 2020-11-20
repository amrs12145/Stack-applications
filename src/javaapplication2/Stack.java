
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
    Stack tmp;
    
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




void display()
{
    tmp = new Stack();
    System.out.print( "Displaying the Stack...\n( " );
    
    while( !isEmpty() )
    {
        int d = pop();
        String h= isEmpty()? "":" , ";
        System.out.print( d +  h );
        tmp.push( d );
    }
    
    while( !tmp.isEmpty() )
    {
        push( tmp.pop() );
    }
    
    
    System.out.println( ")\nDone." );
}



boolean search(int data)
{
    tmp = new Stack();
    boolean found = false;
    
    while( !isEmpty() )
    {
        if ( top.data == data )
        {
            found = true;
            break;
        }
        else
        {
            tmp.push(pop() );
        }
    }

    while( !tmp.isEmpty()  )
    {
        push( tmp.pop() );
    }

    return found;
}

    int max()
    {
        tmp = new Stack();
        int d;
        int max = pop();
        tmp.push( max );
        //push( max );
        
        while( !isEmpty() )
        {
            d = pop();
            tmp.push( d );

            if( d > max )
                max = d;

        }
        while( !tmp.isEmpty() )
            push( tmp.pop() );
        return max;
    }
    
    int min()
    {
        tmp = new Stack();
        int d;
        int min = pop();
        //tmp.push( min );
        push( min );
        
        while( !isEmpty() )
        {
            d = pop();
            tmp.push( d );
            
            if ( d < min )
                min = d;   
        }
        
        while( !tmp.isEmpty() )
            push( tmp.pop() );
        
        
        return min;
    }
    

    
    
}
