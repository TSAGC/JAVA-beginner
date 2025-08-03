public class ShoppingCart8_1 {
    public static void main(String[] args) {
        Item8_1 item1 = new Item8_1();

        item1.color = 'B' ;

        if (item1.setColor('B')){
            System.out.println("Item Color: B");
        }else {
            System.out.println("Item color is invalid");
        }
    }
}
