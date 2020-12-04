
package javaapplication2;



class Node<T>
{
    T data;
    Node next;
    public Node( T data, Node next )
    {
        this.data = data;
        this.next = next;
    }
}
      
        
public class Stack<T>
{
    Node top = null;
    Stack tmp;
    
    void push(T data)
    {
        Node n = new Node( data, top );
        
        top = n;
    }
    T pop()
    {
        if ( !isEmpty() )
        {
            T res = (T) top.data;
            top = top.next;
            return res;
        }
        return null;
    }
    boolean isEmpty()
    {
        return top==null;
    }
    // By mobile


Object peek()
{
    return top.data;
}




void display()
{
    tmp = new Stack();
    System.out.print( "Displaying the Stack...\n( " );
    
    while( !isEmpty() )
    {
        T d = pop();
        String h= isEmpty()? "":" , ";
        System.out.print( d +  h );
        tmp.push( d );
    }
    
    while( !tmp.isEmpty() )
    {
        push( (T)tmp.peek() );
    }
    
    
    System.out.println( ")\nDone." );
}



boolean search(T data)
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
        push( (T)tmp.pop() );
    }

    return found;
}
/*
    T max()
    {
        tmp = new Stack();
        T d;
        T max = pop();
        tmp.push( max );
        //push( max );
        
        while( !isEmpty() )
        {
            d = pop();
            tmp.push( d );

            if( d.compareTo > max )
                max = d;

        }
        while( !tmp.isEmpty() )
            push( (T)tmp.pop() );
        return max;
    }
    
    T min()
    {
        tmp = new Stack();
        T d;
        T min = pop();
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
            push( (T)tmp.pop() );
        
        
        return min;
    }
*/
    

    
    
}
