public class Lesson4Exercises {
    public static void main (String[] args){
    Exercise4_1();
    Exercise4_2();
    }

    public static void Exercise4_1(){
        String CustName = "Victor";
        String itemDesc = "White Bread";
        String message ;

        message = CustName + "bought" + itemDesc;

        System.out.println(message);
    }


    public static void Exercise4_2(){
        double price = 10.50 ;
        double tax = 1.50 ;

        int quantity ;
        double total ;

        quantity = 2 ;

        total = price * quantity * tax ;

        System.out.println(total);
    }
}
