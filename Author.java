public class Author
{
    String name;
    String authorDOB;
    public Author(String n, String d){
        name = n;
        authorDOB = d;
    }

    //preconditions: author has a date of birth
    //postconditions: returns the authors date of birth
    public String getAuthorDOB(){
        return authorDOB;
    }

    //preconditions: author has a name
    //postconditions: returns the authors name
    public String getName(){
        return name;
    }
}
