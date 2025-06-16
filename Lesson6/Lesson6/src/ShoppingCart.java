public class ShoppingCart {



    public static void main(String[] args) {

    }



    public static void UseItemClass(String[] args){
        Item item1 = new Item();

        Item item2 = new Item();

        item1.itemID = 10 ;
        item2.itemID = 20 ;
        item1.desc = "This is a item 1" ;
        item2.desc = "This is a item 2" ;
        item1.price = 10 ;
        item2.price = 20 ;
        item1.quantity = 1 ;
        item2.quantity = 1 ;


    }

//    public static void main(String[] args) {
//        String custName = "Mary Smith";
//        String itemDesc = "Shirt";
//
//        // numeric fields
//        double price = 21.99;
//        int quantity = 2;
//        double tax = 1.04;
//        double total;
//        String message = custName+" wants to purchase "+quantity+" "+itemDesc;
//
//        // Calculating total cost
//        total = (price*quantity)*tax;
//
//
//        // Declare outOfStock variable and initialize it
//        boolean outOfStock = false;
//
//        // Test quantity and modify message if quantity > 1.
//        if (quantity > 1){
//            message = message +"s";
//        }
//
//        // Test outOfStock and notify user in either case.
//        if (outOfStock){
//            System.out.println(itemDesc+" is out of stock.");
//        }
//        else{
//            System.out.println(message);
//            System.out.println("Total cost with tax: "+ total);
//        }
//
//    }



//    public static void main(String[] args) {
//        // local variables
//        String custName = "Mary Smith";
//        String message = custName + " wants to purchase a several items.";
//
//        //Declare and initialize the items String array
//        String[] items = {"Shirt","Socks","Scarf","Belt"};
//
//        // Change message to show the number of items purchased.
//        message = custName + " wants to purchase "+items.length+" items.";
//        System.out.println(message);
//
//        // Print an element from the items array.
//
//        System.out.println(items[2]);
//        //System.out.println(items[4]);
//    }



//    public static void main(String[] args) {
//        // local variables
//        String custName = "Mary Smith";
//        String message;
//
//        double price = 21.99;
//        int quantity = 2;
//        double tax = 1.04;
//
//        String items[];
//        items = new String[4];
//        items[0] = "Shirt";
//        items[1] = "Belt";
//        items[2] = "Scarf";
//        items[3] = "Skirt";
//
//        message = custName + " wants to purchase "+items.length+" items.";
//        System.out.println(message);
//
//        // Iterate through and print out the items from the items array
//        System.out.println("Items purchased: ");
//
//        for (String item : items ){
//            System.out.print(item + ", ");
//        }
//    }








}
