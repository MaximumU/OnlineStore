/*Implement the following functionality into the store:

  instance variables: 
    profit: how much money the store has made
    items:  instance variable (could be an array or LinkedList or ArrayList of one of the other classes)

  methods:
    showItems: displays all items available for sale
    addItem: adds an item for sale
    sellItem(itemName): removes the item from the store and adds its price to profit
    creator(itemName): displays who created the item in question

    You will need to include the following information to be stored in the inheritance heiarchy using the other classes:
      name of thing being sold
      price for things that are on sale
      names of creators of movies and books
      date of birth of book authors
      date that things are placed on sale
      duration of movies
      publisher of books

    Where these variables are stored and how to name them is up to you!
*/

//Code written by Liam Walker on October 4th
//Code establishes a store class and defines items in the store
public class Store
{
  public Store(){
    private int profit;
    private ArrayList<ItemForSale> items = new ArrayList<ItemForSale>();
  }

  public void showItems(){
    for(int i = 0; i < items.size(); i++){
      System.out.print(items.get(i).getName());
    }
  }

  public void addItem(ItemForSale i){
    items.add(i);
  }

  public void sellItem(ItemForSale s){
    for(int i = 0; i < items.size(); i++){
      if(s.equals(items.get(i))){
        items.remove(i);
        return;
      }
    }
  }

  public String getCreator(ItemForSale){
    for(int i = 0; i < items.size(); i++){
      if(s.equals(items.get(i))){
        return items.get(i).getCreator();
      }
    }
  }
}
