public class ShoppingCart {

    public static void main(String[] args) {

        Item item1 = new Item();
        Item item2 = new Item();

        item1.description = "Bar One";
        item2.description = "Kit Kat";

        System.out.println(item1.description);
        System.out.println(item2.description);
    }
}
