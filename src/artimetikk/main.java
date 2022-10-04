package artimetikk;

import javax.swing.*;
import javax.swing.plaf.basic.BasicScrollPaneUI;

public class main {

    public static void main(String[] args) {
        //task 1
        String name = JOptionPane.showInputDialog("Name");
        int yearborn = Integer.parseInt(JOptionPane.showInputDialog("what year where you born"));
        int year = 2018;
        int currage = year - yearborn;
        int agein55 = 2053 - yearborn;
        System.out.println(name + " is " + currage + ". He is born in  " + yearborn + ". In 2053 he is " + agein55);

        //Task 2
        int antall = 0;
        while (antall < 10) {
            antall += 2;
            System.out.println(antall);
        }

        //task 3

        double side1 = Integer.parseInt(JOptionPane.showInputDialog("Side 1 of rectangle"));
        double side2 = Integer.parseInt(JOptionPane.showInputDialog("Side 2 of rectangle"));
        double sumre =  side1 * side2;
        System.out.println(side1 + " * " + side2 + " = " + sumre);

        //task 4

        double radian = Integer.parseInt(JOptionPane.showInputDialog(" Write in radius of circle"));
        double sumCircle= Math.PI * Math.pow(2, radian);
        System.out.println("omkrets: " + sumCircle);

        //Task 5
        double  c=0, f =0;
        c = (f - 32)/1.8;
        f= Integer.parseInt(JOptionPane.showInputDialog("Write in the degrees in fahrenheit"));
        System.out.println("Celcius: " + c);

        //task 6
        double USDvalue = 10.44;
        double sumInNok= Integer.parseInt(JOptionPane.showInputDialog("write the number of freedom bucks")) * USDvalue;
        JOptionPane.showMessageDialog(null, "in NOK: " + sumInNok);

        //task 7
        int noOfpersons = Integer.parseInt(JOptionPane.showInputDialog("Number of Persons"));
        int noOfpizzas = Integer.parseInt(JOptionPane.showInputDialog("Number of pizzas"));
        int slicesPerPerson = noOfpizzas / noOfpersons;
        int noOfslicesLeft = noOfpizzas % noOfpersons;

        System.out.println("Pizzas: "+noOfpizzas + "Persons: " + noOfpersons + "slices per person: " + slicesPerPerson + "Slices left: " + noOfslicesLeft);

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

        int age = Integer.parseInt(JOptionPane.showInputDialog("whats your age"));

        //Too old
        if (age <= 18) JOptionPane.showMessageDialog(null, "you are old enough");

        //Too young
        if (age > 18) JOptionPane.showMessageDialog(null, "you are too young");

        if (age >= 18 && age <= 16) JOptionPane.showMessageDialog(null, "You can pratice driving");

        //task 11


    }
}
