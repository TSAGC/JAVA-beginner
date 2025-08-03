public class Item8_1 {

    public char color;

    public static void main(String[] args) {
        Item8_1 item = new Item8_1();

        char color = 'B'; // test value
        boolean isValid = item.setColor(color);

        System.out.println("Is color valid? " + isValid);
    }

    public boolean setColor(char colorCode) {
        if (colorCode == 'A') {
            return false;
        } else {
            return true;
        }
    }
}
