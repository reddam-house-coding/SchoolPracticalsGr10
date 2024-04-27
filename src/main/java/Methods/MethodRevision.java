/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Methods;

/**
 *
 * @author Cliftonb
 */
public class MethodRevision {

    public static void main(String[] args) 
    {
        String name = "Clifton";
        sayHello();
        sayMyName(name);

        String newName = giveMeAName();
    }

    public static void sayHello() 
    {
        System.out.println("Hello");
    }

    public static void sayMyName(String name) 
    {
        int a = 5;
        int b = 8;
        int num = add(a, b);
        System.out.println("Hello " + name + " " + num);
        System.out.println("VALUE: " + a);
    }

    public static String giveMeAName() 
    {
        String name = "John";
        return name;
    }

    public static int add(int num1, int num2) 
    {
        return num1 + num2;
    }

    public static double calculation(int num1, boolean square) 
    {
        double output = 0;
        if (square) 
        {
            output = Math.sqrt(num1);
        } else 
        {
            output = Math.pow(num1, 3);
        }

        return output;
    }
}
