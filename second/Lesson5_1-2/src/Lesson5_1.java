public class Lesson5_1 {

    public static void main(String[] args) {

        String custName = "Savvas" ;
        String itemDesc = "Java Programming" ;
        String message;
        int quantity = 0 ;
        double price;
        double tax;
        double total;
        boolean outOfStock = false;

        if (quantity < 1) {
            outOfStock = true;
        }

        if (outOfStock == true) {
            System.out.println("You are out of stock");
        }



    }
}
