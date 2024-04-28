/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ScannersPrintwriters;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Cliftonb
 */
public class ScannerWithFileBasics {
    public static void main(String[] args) {
        try {
            String list = "Butter Aubergine lego peanuts";
            Scanner sc = new Scanner(list);
            
            String item1 = sc.next();
            String item2 = sc.next();
            String item3 = sc.next();
            String item4 = sc.next();
            
            
            File f = new File("data\\data.txt");
            Scanner fileSc = new Scanner(f);
            
            
            String firstname = fileSc.next();
            String surname = fileSc.next();
            int age = fileSc.nextInt();
            double weight = fileSc.nextDouble();
            
            int numFriends = fileSc.nextInt();
            
            String greeting = fileSc.nextLine();
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ScannerWithFileBasics.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
