package klasserogobjekter1;

public class Calculator {
  protected static  int number1 = 0;
   protected static int number2 = 0;

    public Calculator(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }
// didnt take in parameters, but look at the constructor above to see how you take in parameters
    public int getNumber1() {
        return number1;
    }

    public int getNumber2() {
        return number2;
    }

    public static int add(){
        return number1 + number2;
    }

    public static int sub(){
        return number1 - number2;
    }

    public static int time(){
        return number1 * number2;
    }

    public static int div(){
        return number1 / number2;
    }
}
