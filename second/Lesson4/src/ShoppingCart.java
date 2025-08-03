public class ShoppingCart {

    public static void main(String[] args) {
        String name = "Savvas";
        String itemDesc = "Lint chocolate";
        String Message;
        double price, total, tax;
        int quantity;



        price = 60 ;
        quantity = 1;
        tax = 50;

        total = price * quantity + tax;
        Message = name +" "+"has bought" + " " + itemDesc+": total price of"+ total ;


        System.out.println(Message);
    }
}
