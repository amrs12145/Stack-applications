
package javaapplication2;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        if ( IsBalanced( sc.next() ) )
        {
            System.out.println("Balanced");
        }
        else
        {
            System.out.println("Not Balanced");
        }
            
    }
    
    
    
    
    
    
    /*************  KEEP IT SIMPLE, STUPID   *************/
    
    static boolean IsBalanced(String exp)
    {
        Stack obj = new Stack();
        
        for(int i=0; i<exp.length() ;i++)
        {
            char c = exp.charAt(i);
            
            if( c=='(' || c=='{' || c=='[' )
                obj.push(c);
            
            else if ( c==')' || c=='}' || c==']' )
            {
                
                if( obj.isEmpty() || !arePair( (char) obj.pop() , c ) )
                    return false;
            }
        }
        
        if ( !obj.isEmpty() )
            return false;
        
    return true;
    }
    
    
    static boolean arePair(char open,char close)
    {
        if( open=='(' && close==')' )
            return true;
        else if( open=='{' && close=='}' )
            return true;
        else if( open=='[' && close==']' )
            return true;
    return false;
    }
    
    
    
}


