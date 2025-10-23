public class ItemForSale
{
    protected String name;
    protected double price;
    protected String creator;
    protected String creatorDOB;
    protected String itemDOS;

    public ItemForSale(String n, double p, String c, String b, String c){
        name = n;
        price = p;
        creator = c;
        creatorDOB = b;
        itemDOS = c;
    }

    //preconditions: item has a name
    //postconditions: returns the items name
    public String getName(){
        return name;
    }

    //preconditions: item has a price
    //postconditions: returns the items price
    public double getPrice(){
        return price;
    }

    //preconditions: item has a creator
    //postconditions: returns the items creator
    public String getCreator(){
        return creator;
    }

    //preconditions: item has a creator that has a date of birth
    //postconditions: returns the items creators date of birth
    public String getCreatorDOB(){
        return creatorDOB;
    }

    //preconditions: item has a date of sale
    //postconditions: returns the items date of sale
    public String getItemDOS(){
        return itemDOS;
    }
}