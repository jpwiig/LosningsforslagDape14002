package kontrollstrukturer2;

public class faculty {
    //using reccurtion to solve this one, more about this later
    public int recursvieFac(int x){
        if (x == 0) return 1;
        return x * recursvieFac(x-1);
    }
}
