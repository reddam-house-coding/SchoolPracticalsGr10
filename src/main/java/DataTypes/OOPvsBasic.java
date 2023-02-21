/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataTypes;

/**
 *
 * @author Cliftonb
 */
public class OOPvsBasic {
    public static void main(String[] args) {
        //primitive types
        byte num4 = 127;
        short num2 = 32_767;
        int num = 2_147_483_647;
        long num3 = 5;
        
        float num5 = 3.3423f;
        double num6 = 3.342;
        
        char ch = 'a';
        
        
        boolean isBandileCool = true;
        
        //object types
        String str = "Hello";
        String str2 = new String("Hello darkness my old friend");
//        System.out.println(str2.length());
//        System.out.println(str2.charAt(5));
        
        //objects have fields and methods
        //Gogga fields - size, color, xPos, yPos, direction
        //Gogga methods - move(), turnLeft(), setDirection(Gogga.RIGHT)
        
        //random numbers
        System.out.println(Math.random()*100);
        //  x e [0, 1) x is a Real Number
        
        // x e [20,30] x is an Integer
        // [20, 31)
        // Math.random() * range + min
        int num10 = (int) (Math.random() *(11) + 20);
        System.out.println(num10);
        
        
    }
}
