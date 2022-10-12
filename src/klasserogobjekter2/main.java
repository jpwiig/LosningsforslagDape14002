package klasserogobjekter2;

import javax.swing.*;

public class main {
    public static void main(String[] args) {
//task 1
        Person p1 = new Person(JOptionPane.showInputDialog("name: "), JOptionPane.showInputDialog("Last name: "), JOptionPane.showInputDialog("Adress: "), JOptionPane.showInputDialog("phone"));
        p1.toSwing();

        //task 3
        BuySomegas gassy = new BuySomegas("esso carl berner", "95", 23, 65.90, "22-11-2022");

        System.out.println( String.format("%.2f",gassy.findTotalPrice(gassy.litrefilled, gassy.priceperliter)));

        //task 4

        Klokke clock = new Klokke(120, 120, 120);
        System.out.println(clock.getH() +"-"+ clock.getM() +"-"+ clock.getS());
    }
}
