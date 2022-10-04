package variabler2;

import javax.swing.*;

public class main {
    public static void main(String[] args) {
        //task 1
        int age = Integer.parseInt(JOptionPane.showInputDialog("write my age"));
        JOptionPane.showMessageDialog(null, "My  age is: " + age);

        //task 2 & 3
        double val1, val2, val3, sum, avg;
        val1 = Double.parseDouble(JOptionPane.showInputDialog("write the first decimal: "));
        val2 = Double.parseDouble(JOptionPane.showInputDialog("write the second decimal: "));
        val3 = Double.parseDouble(JOptionPane.showInputDialog("write the third decimal: "));
        sum =  val1 + val2 + val3;
        avg = sum / 3;
        System.out.println("The sum is: " + sum);
        System.out.println("average: " + avg);

        //task 4

        double val4, val5, val6, sum1, avg1;

        try{
            val4 = Double.parseDouble(JOptionPane.showInputDialog("write the first decimal: "));
            val5 = Double.parseDouble(JOptionPane.showInputDialog("write the second decimal: "));
            val6 = Double.parseDouble(JOptionPane.showInputDialog("write the third decimal: "));

            sum1 =  val4 + val5 + val6;
            avg1 = sum1 / 3;
            System.out.println("The sum is: " + sum1);
            System.out.println("average: " + avg1);

        }catch (Exception e){
            avg1 = 0;
            sum1 = 0;
            System.out.println("The sum is: " + sum1);
            System.out.println("average: " + avg1);
        }

    }

}
