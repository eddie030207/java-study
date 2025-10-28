package construct.ex;

public class BookMain {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.displayinfo();

        Book book2 = new Book("Hello Java", "Seo");
        book2.displayinfo();

        Book book3 = new Book("JPA Programming", "Kim", 700);
        book3.displayinfo();
    }
}
