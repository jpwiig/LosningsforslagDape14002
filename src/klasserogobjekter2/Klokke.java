package klasserogobjekter2;

public class Klokke {
    int h = 0;  //hour
    int m = 0; //minute
    int s = 0; //second

    public Klokke(int h, int m, int s) {
        if (h <= 24)  this.h = h;
        if (h >= 24)throw new NullPointerException("Too many hours");
        if (m <= 60)  this.m = m;
        if (m >= 60) throw new NullPointerException("Too many hours");
        if (s <= 60) this.s = s;
        if (s >= 60) throw new NullPointerException("Too many hours");
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {

        if(h <= 24)this.h = h;
        else throw new NullPointerException("Too many hours");
    }

    public int getM() {
        return m;
    }

    public void setM(int m) {
       if(m <= 60) this.m = m;
       else throw new NullPointerException("Too many minutes");
    }

    public int getS() {
        return s;
    }

    public void setS(int s) {
        if (s >= 60)this.s = s;
        else throw new NullPointerException("Too many seconds");
    }
}
