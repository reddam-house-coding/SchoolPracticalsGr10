package Assessments.Y2022.Term1;

import javax.swing.JOptionPane;
public class ForLoops{
   public static void main (String [] args){
      
      
      double sum = 0;
for(int i = 1; i <= 10; i ++){
    sum +=((double)i)/(i+1);
    System.out.println(i + "/" + (i+1));
}
System.out.println(sum);
     
      
   }
}