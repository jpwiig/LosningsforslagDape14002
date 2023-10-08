package interfaces;

public interface exampleInterFace {

    // Interface kan brukes til å bestemme hva slags metoder som må være i en klasse, dette kan være nyttig hvis du f.eks skal lage en datastruktur, men vi holder det enkelt her med bank eksempel :-)
    public void addMoney(double sum);
    public void addNewaccount(String Accname, double added);
    public double returnValueInanothervaluta(String valuta, String Accname);
}
