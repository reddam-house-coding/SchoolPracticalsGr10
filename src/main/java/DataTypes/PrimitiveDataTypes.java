/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataTypes;

/**
 *
 * @author Cliftonb
 */
public class PrimitiveDataTypes {
    
    public static void main (String [] args){
        
        
        //declaration
        int num;
        
        //initialisation
        num = 5;
        
        //assignment1
        num = 7;
        
        
        //declare and initialise in one line
        int num2 = 8;
        
        
        int costOfTripPerPerson = 500;
        int numPeople = 14;
        int totalCost = costOfTripPerPerson * numPeople;
        
        System.out.println("The total cost of the trip is " + totalCost);
        
        
        double height = 1.89;
        double weight = 94.3;
        
        double bmi = weight/(height*height);
        
        System.out.println("Your bmi is " + bmi);
        
        
    }
}
