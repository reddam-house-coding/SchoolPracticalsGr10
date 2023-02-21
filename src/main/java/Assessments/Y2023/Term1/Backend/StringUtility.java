/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assessments.Y2023.Term1.Backend;

/**
 *
 * @author Cliftonb
 */
public class StringUtility {
    public static String modernizer(String input){
        String output="";
        
        for(int i = 0; i < input.length(); i++){
            char current = input.toLowerCase().charAt(i);
            if(current == 'e'){
                output += '3';
            }
            else if(current == 't'){
                output += '7';
            }
            else if(current == 's'){
                output += '5';
            }
            else if(current == 'i'){
                output += '1';
            }
            else if(current == 'o'){
                output += '0';
            }
            else{
                output += input.charAt(i);
            }
        }
        
        return output;
    }
    
    public static String countVowelsAndConsonants(String input){
        int countV = 0;
        int countC = 0;
        
        for (int i = 0; i < input.length(); i++) {
            char current = input.toLowerCase().charAt(i);
            
            if(current == 'a' || current == 'e' || current == 'i' || current == 'o' || current == 'u'){
                countV++;
            }
            else if(Character.isLetter(current)){
                countC++;
            }
            
        }
        
        return "There are " +countV + " vowels and " + countC + " consonants.";
    }
    
    
    //2023-01-30
    //30/01/23
    public static String convertDate(String input){
        String day = input.substring(8);
        String month = input.substring(5,7);
        String year = input.substring(2,4);
        return day + "/" + month + "/" + year;
    }
    
    public static String changeJohn(String input){
        int johnIndex = input.indexOf("John");
        
        String beforeJohn = input.substring(0, johnIndex);
        String afterJohn = input.substring(johnIndex + 4);
        
        return beforeJohn + "Peter" + afterJohn;
    }
    
    public static boolean containsDoubleLetter(String input){
        for (int i = 0; i < input.length()-1; i++) {
            char current = input.charAt(i);
            char next = input.charAt(i + 1);
            if(current == next){
                return true;
            }
            
        }
        return false;
    }
    
    public static boolean checkPassword(String input){
        boolean hasLower = false;
        boolean hasUpper = false;
        boolean hasDigit = false;
        boolean hasOther = false;
        
        for (int i = 0; i < input.length(); i++) {
            char current = input.charAt(i);
            
            if(Character.isLowerCase(current)){
                hasLower = true;
            }
            else if(Character.isUpperCase(current)){
                hasUpper = true;
            }
            else if(Character.isDigit(current)){
                hasDigit = true;
            }
            else{
                hasOther = true;
            }
            
        }
        
        return input.length() >= 8 && hasDigit && hasLower && hasOther && hasUpper;
    }
    
    public static String generateEmail(String input){
        String first = input.substring(0, 3);
        
        int lastSpaceIndex = input.lastIndexOf(" ");
        
        String last = input.substring(lastSpaceIndex + 1, lastSpaceIndex + 4);
        
        int num = (int)(Math.random()* 900 + 100);
        
        return last + first + num + "@gmail.com";
    }
    
    public static String generatePassword(){
        String letters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%&*";
        
        String output = "";
        while(!checkPassword(output)){
            output = "";
            for(int i = 0; i < 8; i ++){
                int ran = (int)(Math.random() * letters.length());
                output += letters.charAt(ran);
            }
        }
        
        return output;
    }
}
