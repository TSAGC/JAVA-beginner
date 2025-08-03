public class ShoppingCart {

    public static void main(String[] args) {
        String CustName = "Savvas Nicolaou" ;
        int spaceIdx = CustName.indexOf(" ");
        System.out.println(spaceIdx);
        String name = CustName.substring(0, spaceIdx);
        System.out.println(name);
        String surname = CustName.substring(spaceIdx+1);
        System.out.println(surname);
    }
}
