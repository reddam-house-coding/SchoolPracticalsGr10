/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Loops;

/**
 *
 * @author Cliftonb
 */
public class ForLoopBasics {
    public static void main(String[] args) {
        
        //before loop (once)
        int total = 0;
        
        for (int count = 1; count <= 20; count ++) {
            //in the the loop (many)
            int multiple = 7 * count;
            total = total + multiple;
        }
        
        //after loop (once)
        System.out.println(total);
    }
}
