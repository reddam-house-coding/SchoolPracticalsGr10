/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Methods;

import javax.swing.JOptionPane;

/**
 *
 * @author Cliftonb
 */
public class MethodScope {
    public static void main(String[] args) {
        int total = add(5, 6);
    }
    
    
    public static int add(int a, int b){
        int total = a + b;
        return total;
    }
}
