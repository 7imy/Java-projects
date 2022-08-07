public class Book {
    private String BookName;
    private Author[] author = new Author[2];
    private double price;
    private int qty=0;

    public Book(String BookName,Author[] author,double price){
        this.BookName = BookName;
        this.author[0]=author[0];
        this.author[1]=author[1];
        this.price= price;
    }
    public Book(String BookName,Author[] author,double price,int qty){
        this.BookName = BookName;
        this.author[0]=author[0];
        this.author[1]=author[1];
        this.price=price;
        this.qty=qty;
    }
    public String getBookName(){
        return BookName;
    }
    public Author getAuthor(){
        return author[author.length];
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){

    }
    public int getQty(){
        return qty;
    }
    public void setQty(int qty){

    }
    public String toString(){
        return "Book [ "+BookName+" ,"+author[0]+" .\n"+author[1]+"\n ,price: "+ getPrice()+" ,qty: "+getQty()+" ]";
    }
}
