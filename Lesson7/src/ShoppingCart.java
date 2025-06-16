public class ShoppingCart {
    public static void main (String[] args){
        Lesson7_1();
        Lesson7_2();
        Lesson7_3();
    }

    public static void Lesson7_1(){
        String custName = "Steve Smith";
        String firstName;
        int spaceIdx;

        spaceIdx = custName.indexOf(" ");
        firstName = custName.substring(0, spaceIdx);
        System.out.println(firstName);
    }

    public static void Lesson7_2(){
        String custName = "Steve Smith";
        String firstName;
        int spaceIdx;
        StringBuilder sb;

        spaceIdx = custName.indexOf(" ");
        firstName = custName.substring(0, spaceIdx);
        System.out.println(firstName);

        sb = new StringBuilder(firstName);
        sb.append(" Smith");
        System.out.println(sb.toString());
    }


    public static void Lesson7_3(){
            int int1;

            long long1 = 99_000_000_000L;
            float flt1 = 13.5F;
            char ch1 = 'U';

            System.out.println("long1: "+long1);
            int1 = (int) long1;
            System.out.println("Long assigned to int var: " + int1);
    }
}