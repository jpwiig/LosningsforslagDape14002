package klasserogobjekter2;

public class BuySomegas {
    String location;
    String gasType;
    double litrefilled;
    double priceperliter;
    String timeFilled;

    public BuySomegas(String location, String gasType, double litrefilled, double priceperliter, String timeFilled) {
        this.location = location;
        this.gasType = gasType;
        this.litrefilled = litrefilled;
        this.priceperliter = priceperliter;
        this.timeFilled = timeFilled;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getGasType() {
        return gasType;
    }

    public void setGasType(String gasType) {
        this.gasType = gasType;
    }

    public double getLitrefilled() {
        return litrefilled;
    }

    public void setLitrefilled(double litrefilled) {
        this.litrefilled = litrefilled;
    }

    public double getPriceperliter() {
        return priceperliter;
    }

    public void setPriceperliter(double priceperliter) {
        this.priceperliter = priceperliter;
    }

    public String getTimeFilled() {
        return timeFilled;
    }

    public void setTimeFilled(String timeFilled) {
        this.timeFilled = timeFilled;
    }

    //actually task 3 code

    public double findTotalPrice (double litrefilled, double priceperliter){
        return litrefilled * priceperliter;
    }

}
