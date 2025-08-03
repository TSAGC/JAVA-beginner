public class Item8_2 {
    public String description ;
    public int quantity ;
    public double price;
    public char color = 'u';

    public void displayItem() {
        System.out.println("Description: " + description);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price: " + price);
        System.out.println("Color: " + color);
    }

    public void setItemFields(String description, int quantity, double price) {
        this.description = description;
        this.quantity = quantity;
        this.price = price;
    }

    public int setItemFields(String description, int quantity, double price, char col) {
         if (col != ' ') {
             color = col;
             setItemFields(description, quantity, price, col);
             return 1;
         }else{
             return -1 ;
         }
    }
}
