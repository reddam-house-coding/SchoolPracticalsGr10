/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assessments.Y2023.JuneExam;

import javax.swing.JOptionPane;

/**
 *
 * @author Cliftonb
 */
public class Triangles {

    public static void main(String[] args) {
        //Q1.1   4 marks
        int angle1 = Integer.parseInt(JOptionPane.showInputDialog("Enter angle 1"));
        int angle2 = Integer.parseInt(JOptionPane.showInputDialog("Enter angle 2"));
        int angle3 = Integer.parseInt(JOptionPane.showInputDialog("Enter angle 3"));

        //Q1.2   4 marks
        double sum = angle1 + angle2 + angle3;
        if (sum != 180) {
            System.out.println("IMPOSSIBLE");
        }
        //Q1.3/1.4    15 marks
        else {//1 mark

            if (angle1 == angle2 || angle1 == angle3 || angle2 == angle3) { //5 marks
                System.out.println("ISOSCELES"); //1 mark
            } else if (angle1 == angle2 && angle2 == angle3) { //4 mark
                System.out.println("EQUILATERAL"); //1 mark
            } else { //2 mark
                System.out.println("SCALENE"); //1 mark
            }
        }
    }
}