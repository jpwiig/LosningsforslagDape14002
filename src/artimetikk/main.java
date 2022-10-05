package artimetikk;

import javax.swing.*;
import javax.swing.plaf.basic.BasicScrollPaneUI;

public class main {

    public static void main(String[] args) {
        //task 1
        try {
            String name = JOptionPane.showInputDialog("Name");
            int yearborn = Integer.parseInt(JOptionPane.showInputDialog("what year where you born"));
            int year = 2018;
            int currage = year - yearborn;
            int agein55 = 2053 - yearborn;
            System.out.println(name + " is " + currage + ". He is born in  " + yearborn + ". In 2053 he is " + agein55);
        } catch (Exception e) {
            System.out.println("Error in task 1" + e);
        }
        //Task 2
        try {
            int antall = 0;
            while (antall < 10) {
                antall += 2;
                System.out.println(antall);
            }
        } catch (Exception e) {
            System.out.println("error in task 2 " + e);
        }

        //task 3
        try{
            double side1 = Integer.parseInt(JOptionPane.showInputDialog("Side 1 of rectangle"));
            double side2 = Integer.parseInt(JOptionPane.showInputDialog("Side 2 of rectangle"));
            double sumre = side1 * side2;
            System.out.println(side1 + " * " + side2 + " = " + sumre);
        } catch (Exception e){
            System.out.println("error in task 3 " + e);
        }
        //task 4
       try {
            double radian = Integer.parseInt(JOptionPane.showInputDialog(" Write in radius of circle"));
            double sumCircle = Math.PI * Math.pow(2, radian);
            System.out.println("omkrets: " + sumCircle);
        }catch (Exception e){
           System.out.println("Error in task 4 " + e);
       }

        //Task 5
        try{
            double c = 0, f = 0;
            c = (f - 32) / 1.8;
            f = Integer.parseInt(JOptionPane.showInputDialog("Write in the degrees in fahrenheit"));
            System.out.println("Celcius: " + c);
        }catch (Exception e){
            System.out.println("error in task 5" + e);
        }
        //task 6
        try{
            double USDvalue = 10.44;
            double sumInNok = Integer.parseInt(JOptionPane.showInputDialog("write the number of freedom bucks")) * USDvalue;
            JOptionPane.showMessageDialog(null, "in NOK: " + sumInNok);
        } catch (Exception e){
            System.out.println("Error in task 6 " + e);
        }
        //task 7
        try {
            int noOfpersons = Integer.parseInt(JOptionPane.showInputDialog("Number of Persons"));
            int noOfpizzas = Integer.parseInt(JOptionPane.showInputDialog("Number of pizzas"));
            int slicesPerPerson = (noOfpizzas * 8) / noOfpersons;
            int noOfslicesLeft = noOfpizzas % noOfpersons;

            System.out.println("Pizzas: " + noOfpizzas + "Persons: " + noOfpersons + "slices per person: " + slicesPerPerson + "Slices left: " + noOfslicesLeft);
        } catch (Exception e){
            System.out.println("error in task 7 " +e);
        }
        //task 9, not bothered to calculate task 8
        /*
        * sett tall1 = 5
    sett tall2 = 4
    tall1 == tall2 : false
    tall1 != tall2 : true
    tall1 <= tall2 : true
    tall1 >= tall2 : fasle
    tall1 < tall2  : true
    tall1 > tall2  : false
        *
        * */

        //task 10
        //License = 18

        try {
            int age = Integer.parseInt(JOptionPane.showInputDialog("whats your age"));

            //Too old
            if (age >= 18) JOptionPane.showMessageDialog(null, "you are old enough");

            //Too young
            if (age < 18) JOptionPane.showMessageDialog(null, "you are too young");

            if (age >= 18 && age >= 16) JOptionPane.showMessageDialog(null, "You can pratice driving");
        }catch (Exception e){
            System.out.println("Error in task 10");
        }
        //task 11


    }
}
