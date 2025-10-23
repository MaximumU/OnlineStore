public class Movie extends itemForSale
{
    int duration;
    public Movie(String n, double p, String c, String b, String c, int d){
        duration = d;
    }
    public Movie(){}

    //preconditions: movie has a duration
    //postconditions: returns the movies duration
    public int getDuration(){
        return duration;
    }
}
