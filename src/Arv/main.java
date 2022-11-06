package Arv;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        ArrayList<Veicheles>things = new ArrayList<>();
        Car c1= new Car("cool", "12","kml123456", 1290);
        Motorcycle M1 = new Motorcycle("very cool","12","KKL1239089","130");
        things.add(c1);
        things.add(M1);
    }
}
