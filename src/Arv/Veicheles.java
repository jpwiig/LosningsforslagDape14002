package Arv;

import java.util.Date;

public class Veicheles {
    String type;
   String firstTimeRegister;
    String Sign;

    public Veicheles(String type, String firstTimeRegister, String sign) {
        this.type = type;
        this.firstTimeRegister = firstTimeRegister;
        Sign = sign;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFirstTimeRegister() {
        return firstTimeRegister;
    }

    public void setFirstTimeRegister(String firstTimeRegister) {
        this.firstTimeRegister = firstTimeRegister;
    }

    public String getSign() {
        return Sign;
    }

    public void setSign(String sign) {
        Sign = sign;
    }

    @Override
    public String toString() {
        return "Veicheles{" +
                "type='" + type + '\'' +
                ", firstTimeRegister=" + firstTimeRegister +
                ", Sign='" + Sign + '\'' +
                '}';
    }
}
