public class Item {
    char color;
    String desc;
    int quantity;
    double price;
    char colorCode = 'U';

    public boolean setColor(char colorCode){
        if (colorCode == ' '){
            return false;
        }else {
            this.color = colorCode;
            return true;
        }
    }

    public void displayItem() {
        System.out.println("Item: " + desc + ", " + quantity + ", "
                + price + ", "+colorCode);
    }

    public void setItemFields(String desc, int qty, double pr) {
        this.desc = desc;
        this.quantity = qty;
        this.price = pr;
    }

    public int setItemFields(String desc, int qty, double pr, char c) {
        if (c != ' ') {
            colorCode = c;
            this.setItemFields(desc, qty, pr);
            return 1;
        } else return -1;
    }
}