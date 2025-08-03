public class Lesson5_2 {
    public static void main(String[] args) {
        String custName = "Savvas" ;
        String[] item = new String[4] ;
        item[0] = "Bar One Chocolate" ;
        item[1] = "powerade";
        item[2] = "coffie";
        item[3] = "lays";

        String message;
        int quantity = item.length;
        int custChoice = 0 ;
        double price;
        double tax;
        double total;
        boolean outOfStock = false;


        message = "all the items are" + "1 :" + item[0] + " 2 :" + item[1] + " 3 :" + item[2] + " 4 :" + item[3];

        System.out.println(message);

        custChoice = 1 ;

        switch (custChoice) {
            case 1:
                System.out.println("Customer chose " + item[0]);
                break;
            case 2:
                System.out.println("Customer chose " + item[1]);
                break;
            case 3:
                System.out.println("Customer chose " + item[2]);
                break;
            case 4:
                System.out.println("Customer chose " + item[3]);
                break;
        }


    }
}
