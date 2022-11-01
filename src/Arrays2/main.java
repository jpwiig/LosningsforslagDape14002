package Arrays2;

import java.util.ArrayList;

public class main {
    public static void main(String[]args) {
        //task 1
        int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        //easy way
        System.out.println(intArray[2] + " " + intArray[5]);
        //fun way
        for (int i : intArray) {
            if (i == 3 || i == 6) System.out.print(i + " ");
        }
        //task 2
        int[] a = {1, 4, 5, 6, 7, 8, 9, 10, 11};
        for (int i : a) {
            System.out.println(i);
        }

        //task 3
        int[] a2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        ArrayList<Integer> AL2 = new ArrayList<>(); // Arraylist in my <3
        for (int i : a2) {
            AL2.add(i);
        }
        for (int i : AL2) {
            System.out.println(i);
        }

        ArrayList<Integer> AL = new ArrayList<>();
        AL.add(1);
        AL.add(2);
        AL.add(3);
        AL.add(4);
        AL.add(5);
        AL.add(6);
        AL.add(7);
        AL.add(8);
        AL.add(9);

        Object[] a3 = AL.toArray(); //might not be pensum but a whole less code
        System.out.println("arraylist to array: ");
        for (Object i : a3) {
            System.out.print(i + " ");
        }
// i dont remember this one, might need to go back on this
        int[][] rev = {{4, 7, 6}, {6, 9, 9}, {2, 4, 3}, {5, 8, 7}};
        System.out.println("Rev: ");
        for (int i = 0; i <= rev.length; i++) {
            for (int j = 0; j <= rev.length; j++) {
                System.out.print(rev[j][i] + " ");
            }
        }
    }
}
