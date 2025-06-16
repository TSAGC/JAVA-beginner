public class ShoppingCart {
    public static void main(String[] args){
        Lesson8_1();
        Lesson8_2();
    }

    public static void Lesson8_1(){
        Item item1 = new Item();

        if (item1.setColor('B')){
            System.out.println("Item1.color = "+item1.color);
        }else System.out.println("Invalid color");
    }


    public static void Lesson8_2(){
        Item item1 = new Item();

        item1.setItemFields("Belt", 1, 29.50);
        item1.displayItem();

        int retcode = item1.setItemFields("Shirt", 1, 34.99, ' ');
        if (retcode < 0) {
            System.out.println("Invalid color code.  Item not added.");
        } else {
            item1.displayItem();
        }
    }
}