package prototype;

public class AppForPrototype {
    public static void main(String[] args) throws CloneNotSupportedException {
        BookShop bookShop = new BookShop();
        bookShop.setShopName("Tanvir Books Shop");
        bookShop.loadData();
        System.out.println(bookShop);
        System.out.println("----------\n");


        BookShop otherShop = bookShop.clone();
        bookShop.getBooks().remove(9);
        otherShop.setShopName("Other Books Shop");
        //bookShop.loadData();
        System.out.println(otherShop);
        System.out.println("----------\n");
        System.out.println(bookShop);
    }
}
