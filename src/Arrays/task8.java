package Arrays;

import javax.swing.*;
import java.util.Random;

public class task8 {
    public static void main(String[] args) {
        //you guys knows try/catch now right
        int numberofstudents = Integer.parseInt(JOptionPane.showInputDialog("numberofstudents"));
        int [] scores = new int[numberofstudents];
        int sum = 0;
        Random r = new Random();
        for (int i = 0; i < scores.length; i++){
            scores[i] = r.nextInt(0,101); //assigns randoms values to the list
        }
        for (int i = 0; i < scores.length; i++){
            sum+=scores[i]; //calculate the scores
        }
        double avg = sum/scores.length;

        System.out.println(avg);
    }

}
