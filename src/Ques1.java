public class Ques1 {

    public static void printPrice(String item) {
        int dividerPosition = item.indexOf("--");
        String itemName = item.substring(0, dividerPosition);
        System.out.println(itemName);
        String price = item.substring(dividerPosition + 3);
        System.out.println(price);
        System.out.println("----------------");
        System.out.println(itemName.trim().toUpperCase() + ": " + price.replace('/', '.'));
    }

    public static void main(String[] args) {
        //WARNING: Do not change the code below
        printPrice("sandwich  --$4/50");
        printPrice("  soda --$10/00");
        printPrice("  fries --$0/50");

    }

}