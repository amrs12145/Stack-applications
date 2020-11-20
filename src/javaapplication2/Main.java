
package javaapplication2;


public class Main {

    public static void main(String[] args)
    {
        Stack obj = new Stack();
        
        obj.push(1);
        obj.push(2);
        obj.push(3);
        obj.push(4);
        obj.push(5);
        obj.push(6);
        obj.pop();
        System.out.println( "max is " + obj.max() + "\nmin is " + obj.min() );
        obj.display();
                
    }
    
}


