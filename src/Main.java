public class Main {
    public static void main(String[] args) {
        Human human1 = new Human("Daniiel","Mykytiuk",18);
        human1.setAge(-1);
        System.out.println(human1.getFullInfo());

        City Chernivtsi = new City("Chernivtsi",262276,"Ukraine");
        System.out.println(Chernivtsi.getFullInfo());

        Country Ukraine = new Country("Ukraine", 44130000,461);
        System.out.println(Ukraine.getFullInfo());

        Fraction fraction = new Fraction(1,2);
        System.out.println(fraction.getFullInfo());


        Book book = new Book("","",0,"","",0);

        System.out.println(book.getFullInfo());

        book.setYearOfPublication();
        System.out.println(book.getFullInfo());

        book.setInfo("2","Barak Obama",1300);
        System.out.println(book.getFullInfo());

        book.setGenre();
        System.out.println(book.getFullInfo());
    }
}