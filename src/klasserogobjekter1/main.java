package klasserogobjekter1;

import javax.swing.*;
import java.sql.SQLOutput;
import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        //Task 1 & 2  in main
        Books book1 = new Books("Ill be gone in the dark","Michelle McNamara", 123.00, "97800062319784");
     book1.toString();

     Books book2 = new Books(JOptionPane.showInputDialog("NAME OF BOOK"), JOptionPane.showInputDialog("AUTHOR"), Integer.parseInt(JOptionPane.showInputDialog("PRICE")), JOptionPane.showInputDialog("ISBN"));
    book2.toString();

    //task 3 & 4 in main
        //list of persons since why not, this is an early introduction

        ArrayList<Person>Persons = new ArrayList<>();
        Persons.add(new Person("Per", "Osloveien", "1345678", 2001));
        Persons.add(new Person(JOptionPane.showInputDialog("name"), JOptionPane.showInputDialog("adress"), JOptionPane.showInputDialog("phone"), Integer.parseInt(JOptionPane.showInputDialog("year born: "))));

        for (Person p : Persons){
            System.out.println("name: " + p.name + "\n adress: " + p.address + "\n phone: " + p.phone + "\n age: " + p.calcage());
        }
        //task 5
        String inNum1 = JOptionPane.showInputDialog("number 1");
        String inNum2 = JOptionPane.showInputDialog("number 2");
        Calculator calc = new Calculator(Integer.parseInt(inNum1), Integer.parseInt(inNum2));
        System.out.println(" add " + calc.add() + " sub " + calc.sub() + " time " + calc.time() +" div " +calc.div());
    }



}
