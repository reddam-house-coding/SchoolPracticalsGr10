/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assessments.Y2023.Term1.Practical;

/**
 *
 * @author Cliftonb
 */
public class SumOfAreas {
    public static void main(String[] args) {
        double sum = 0;
        for (int i = 5; i <= 25; i += 5) {
            double area = Math.PI * 0.5 * Math.pow(i, 2);
            sum += area;
        }
        System.out.println("Area: " + sum);
    }
}
