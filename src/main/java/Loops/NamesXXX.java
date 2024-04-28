package Loops;
import javax.swing.JOptionPane;

public class NamesXXX {
    public static void main(String[] args) {
        
        String name = JOptionPane.showInputDialog("Enter a name");
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter an age"));
        
        int highest = 0;
        String highestName = "";
        
        while(!name.equals("XXX")){
            if(age > highest){
                highest = age;
                highestName = name;
            }
            
            
            name = JOptionPane.showInputDialog("Enter a name");
            age = Integer.parseInt(JOptionPane.showInputDialog("Enter an age"));
        }
        
        System.out.println("Highest age: " + age);
        System.out.println("Highest name: " + highestName);
    }
}
