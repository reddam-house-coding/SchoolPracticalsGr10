/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Methods;

/**
 *
 * @author Cliftonb
 */
public class MethodToolBox {
    public static int add(int a, int b){
        int total = a+b;
        return total;
    }
    
    public static double calculateCost(int numAdults, int numKids, int numNights){
        double total = numAdults*45.7*numNights + numKids*80.45*numNights;
        return total;
    }
}
