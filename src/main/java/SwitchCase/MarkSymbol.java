/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SwitchCase;

import javax.swing.JOptionPane;

/**
 *
 * @author Cliftonb
 */
public class MarkSymbol {
    public static void main(String[] args) {
        
        double mark = Double.parseDouble(JOptionPane.showInputDialog("Enter a percentage"));
        
        while(       (mark < 0)    ||     (mark > 100)     ){
            mark = Double.parseDouble(JOptionPane.showInputDialog("NO, between 0-100"));
            
        }
        
        if(mark >= 79.5){
            System.out.println("A");
        }
        if (mark >= 69.5){
            System.out.println("B");
        }
        if (mark >= 59.5){
            System.out.println("C");
        }
        if (mark >= 49.5){
            System.out.println("D");
        }
        if (mark >= 39.5){
            System.out.println("E");
        }
            System.out.println("F");
    }
}
