package Arv;

import java.util.Date;

public class Car extends Veicheles {
    int loadingcapactiy;

    public Car(String type, String firstTimeRegister, String sign, int loadingcapactiy) {
        super(type, firstTimeRegister, sign);
        this.loadingcapactiy = loadingcapactiy;
    }

}
