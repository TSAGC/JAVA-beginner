import java.util.ArrayList;

public class ShoppingCart {
    Item[] items = {new Item("Shirt",25.60),
            new Item("WristBand",0),
            new Item("Pants",35.99)};

    public static void main(String args[]){
        ShoppingCart cart = new ShoppingCart();
        cart.displayTotal();
        arrayControl();
    }
    public void displayTotal(){
        double total = 0;
        for(int i = 0; i < items.length; i++){
            if(items[i].isBackOrdered())
                continue;
            total += items[i].getPrice();
        }
        System.out.println("Shopping Cart total: "+total);
    }
    public static void arrayControl() {
        ArrayList<String> items = new ArrayList<>();
        items.add("Shirt");
        items.add("WristBand");
        items.add("Pants");

        // add (insert) another element at a specific index
        System.out.println(items);
        items.add(2, "Belt");
        System.out.println(items);

        // Check for the existence of a specific String element.
        // If it exists, remove it.
        if (items.contains ("Shirt")){
            items.remove("Shirt");
        }
        System.out.println(items);
    }
}