
public class Book extends itemForSale
{
    String publisher;
    Author author1;
    public Book(String n, double p, String c, String b, String c, String pu, Author a){
        publisher = pu;
        author1 = a;
    }
    public Book(){}

    //preconditions: book has a publisher
    //postconditions: returns the books publisher
    public String getPublisher(){
        return publisher;
    }

    //preconditions: book has an author
    //postconditions: returns the books author
    public Author getAuthor(){
        return author1;
    }
}
