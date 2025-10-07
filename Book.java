
public class Book extends itemForSale
{
    String publisher;
    Author author1;
    public Book(String n, double p, String c, String b, String c, String pu, Author a){
        publisher = pu;
        author1 = a;
    }
    public Book(){}

    public int getPublisher(){
        return publisher;
    }

    public Author getAuthor(){
        return author1;
    }
}
