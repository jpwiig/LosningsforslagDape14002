package meromklasserogobjekter1;

import java.util.Date;

public class main {

    public static void main(String[] args) {
        Bil [] cars = {new Bil("audi r7", new Dato(11,2,2002),19198291), new Bil("Volvo tofør", new Dato(23,12,1994), 1345624525),
                new Bil("LIKET", new Dato(0,1,2001), 8989898)};
        for (Bil i : cars){
            System.out.println(i.toString());
        }
    }
}
