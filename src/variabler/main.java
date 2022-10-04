package variabler;

import javax.swing.*;

public class main {
    public static void main (String[] args){//Task 1, 2 ,3, 4 & 5
        String fName = JOptionPane.showInputDialog("Enter your first name");
        String lName = JOptionPane.showInputDialog("Enter your last name");
        String adress = JOptionPane.showInputDialog("Enter your adress");
        String postalCode = JOptionPane.showInputDialog("Enter your postal code");
        String city = JOptionPane.showInputDialog("Enter your city");
        String age = JOptionPane.showInputDialog("Enter your age");
      // messagebox

        JOptionPane.showMessageDialog(null,"First name: " +fName + "\n" +
                "Last name: " + lName + "\n" +
                "adress: " + adress + "\n" +
                "Postal code: " + postalCode  +"\n"+
                "City: "+ city +"\n"+
                "age: " + age );

        //sout
        System.out.print("First name: " +fName + "\n" +
                "Last name: " + lName + "\n" +
                "adress: " + adress + "\n" +
                "Postal code: " + postalCode  +"\n"+
                "City: "+ city +"\n"+
                "age: " + age);

    }
}
