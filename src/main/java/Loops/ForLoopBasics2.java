/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Loops;

/**
 *
 * @author Cliftonb
 */
public class ForLoopBasics2 
{
    public static void main(String[] args) 
    {
        FirstMethod();
    }
    
    public static void FirstMethod() 
    {
        System.out.println("I am before");
        //part 1 - initialisation
        //part 2 - continuation condition
        //part 3 - increment/decrement/change (at the end of the code block)
        
        for(int i = 1040; i > 1000; i=i-7)
        {
            System.out.println(i);
        }
        System.out.println("I am after");
        
    }
}
