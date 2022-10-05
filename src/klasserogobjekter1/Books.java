package klasserogobjekter1;

public class Books {
    String title;
    String author;
    double price;
    String iSBN;

    public Books(String title, String author, double price, String iSBN) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.iSBN = iSBN;
    }

    @Override //for older versions of java
    public String toString (){
        return  "Title: " + title + "\n author: " + author + "\n price: " + price + "\n ISBN " + iSBN;
    }
}
