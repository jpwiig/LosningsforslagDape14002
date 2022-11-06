package meromklasserogobjekter1;

public class Bil {
    //Creates following attributes
    //model, first time regist, skiltnummer
    public String carType;
    public Dato firstRegistered;
    public int plates;

    public Bil(String carType, Dato firstRegistered, int plates) {
        this.carType = carType;
        this.firstRegistered = firstRegistered;
        this.plates = plates;
    }

    @Override
    public String toString() {
        return "Bil: " +
                "Type of car: " + carType + '\'' +
                " first time registered: " + firstRegistered +
                " car plates " + plates;
    }
}
