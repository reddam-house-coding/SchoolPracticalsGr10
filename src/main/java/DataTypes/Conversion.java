/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataTypes;

import javax.swing.JOptionPane;

/**
 *
 * @author Cliftonb
 */
public class Conversion {
    public static void main (String [] args){
        
        //rate - how much per night
        double rate = 395.65;
        
        
        //number of nights
        String input1 = JOptionPane.showInputDialog("How many nights?");
        int numNights = Integer.parseInt(input1);
        
        
        //number of people 
        String input2 = JOptionPane.showInputDialog("How many people?");
        int numPeople = Integer.parseInt(input2);
        
        //total cost - 
        double totalCost = rate*numNights*numPeople;
        
        System.out.println("Total cost " + totalCost);
    }
}
