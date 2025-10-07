public class Author
{
    String name;
    String authorDOB;
    public Author(String n, String d){
        name = n;
        authorDOB = d;
    }
    public String getAuthorDOB(){
        return authorDOB;
    }
    public String getName(){
        return name;
    }
}
