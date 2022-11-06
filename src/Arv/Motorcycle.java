package Arv;

import java.util.Date;

public class Motorcycle extends Veicheles{
    String ccFormotor;
    String typeOfCycle;
    public Motorcycle(String type, String firstTimeRegister, String sign, String ccFormotor) {
        super(type, firstTimeRegister, sign);
        this.ccFormotor = ccFormotor;
    }

    public String getCcFormotor() {
        return ccFormotor;
    }

    public void setCcFormotor(String ccFormotor) {
        this.ccFormotor = ccFormotor;
    }

    public void setTypeOfCycle(){
        int cc = Integer.parseInt(ccFormotor);

        if (cc >= 125){
            this.typeOfCycle ="light";
        } else {
            this.typeOfCycle = "standard";
        }
    }

}
