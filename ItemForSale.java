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

    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }

    public String getCreator(){
        return creator;
    }


    public String getCreatorDOB(){
        return creatorDOB;
    }


    public String getItemDOS(){
        return itemDOS;
    }
}