package kontrollstrukturer1;

import javax.swing.*;

public class main {
    public static void main(String[]args){
        //task 1
        int alcAge = Integer.parseInt(JOptionPane.showInputDialog("how old are ya"));
        if (alcAge > 18 && alcAge  < 22) System.out.println("you can buy alcohol, but only under 22%");
        else if (alcAge > 18) System.out.println("you can buy alcohol");
        else if (alcAge < 18) System.out.println("you can not buy alcohol");

        //task 2 & 3 & 4
        int lisceneAge = Integer.parseInt(JOptionPane.showInputDialog("age"));
        if (lisceneAge >= 70) System.out.println("you need to talk to the doctor to drive m8");
        else if (lisceneAge > 18) System.out.println("you are old enough to drive wrom wrom! you are:  " + lisceneAge);
        else if (lisceneAge < 18 && lisceneAge >=16) System.out.println("you can pratice driving at " + lisceneAge);

        else System.out.println("you cant drive yet, but you can in " + (18 - lisceneAge ));

        //task 5 so you know, i dont like switch


        String month = JOptionPane.showInputDialog("write in a month");

        if (month.equals("january") || month.equals("febuary") || month.equals("december")) {
            System.out.println("its winter!");
        }
        if (month.toLowerCase().equals("march") || month.equals("april") || month.equals("may")) {
            System.out.println("its spring!");
        }
        if (month.equals("june") || month.equals("july") || month.equals("august")) {
            System.out.println("its summer!");
        }
        if (month.equals("september") || month.equals("october") || month.equals("november")) {
            System.out.println("its winter!");
        }
        //switch case
        switch (month.toLowerCase()){ //cleaning up the input to write less code
            case "january", "febuary", "december":
                System.out.println("its winter");
                break;
            case "march", "april", "may":
                System.out.println("its spring");
                break;
            case "june", "july", "august":
                System.out.println("its summer");
                break;
            case "september", "october", "november":
                System.out.println("its autumn");
                break;
        }
    }

}
