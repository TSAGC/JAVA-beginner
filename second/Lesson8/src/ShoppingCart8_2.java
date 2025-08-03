public class ShoppingCart8_2 {
    public static void main(String[] args) {
        Item8_2 item = new Item8_2();
        item.setItemFields("RX-8", 1, 160000);
        item.displayItem();
        Item8_2 item2 = new Item8_2();
        int val = item2.setItemFields("RX-8", 2, 160000, ' ');
        if(val < 0){
            System.out.println("Invalid item field");
        }else {
            item2.displayItem();
        }
    }
}
