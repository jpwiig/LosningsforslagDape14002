package kontrollstrukturer2;

import javax.swing.*;

public class main {
    public static void main(String[] args) {

        //task 9
        faculty f = new faculty();
       System.out.println( f.recursvieFac(10)); //note that is might be limited by not using long

        //harder tasks

        //task 1
        int number =  16; //static
        double pi = 4;
        int front =- 1;
        for(long i  = 3; i < number; i+=2){
            pi += front*(4/(double)i);
            front =-front;
        }
        //task 2
        int number2 = Integer.parseInt(JOptionPane.showInputDialog("write a number"));
        for(int i =1; i <= number2; i++){
            if(i % 1 == 0 && i % i == 0 ) System.out.print(i + " ");

        }

        //task 3

        boolean isitprime = false;
        int prime3 = Integer.parseInt(JOptionPane.showInputDialog("write a prime number"));
        if (prime3 % prime3 == 0 && prime3 % 1 == 0) isitprime = false;
        else {
            isitprime = false;
        }

        if (!isitprime) System.out.println("is not prime");
        else System.out.println("its prime");
    }




}
