package week06_Loops;

public class TestItemObjects {
    public static void main(String[] args) {

        Item item1 = new Item ();
        item1.setInfo("Banana", 10, 1.20);
        System.out.println(item1);

        Item item2 = new Item();
        item2.setInfo("Orange", 10, 2.5);
        System.out.println(item2);

        item1.sellItem(3);
        System.out.println(item1);  // 7 left

        item2.sellItem(4);  // 6 left
        System.out.println(item2);

    }
}
