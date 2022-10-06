import java.util.Scanner;
public class Book {
    private final Scanner sc = new Scanner(System.in);
    private String name;
    private String author;
    private int yearOfPublication;
    private String nameOfThePublishingHouse;
    private String genre;
    private int numberOfPages;
    Book(String name, String author, int yearOfPublication, String nameOfThePublishingHouse, String genre, int numberOfPages){
        this.name=name;
        this.author=author;
        this.yearOfPublication=yearOfPublication;
        this.nameOfThePublishingHouse=nameOfThePublishingHouse;
        this.genre=genre;
        this.numberOfPages=numberOfPages;


    }

    public String getName() {
        return name;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

    public String getNameOfThePublishingHouse() {
        return nameOfThePublishingHouse;
    }
    public void setInfo(String name){
        try{
            this.name = name;
        }catch (Exception ex){
            System.err.println(ex);
        }
    }

    public void setInfo(String name, String author){
        try{
            this.name = name;
            this.author = author;
        }catch (Exception ex){
            System.err.println(ex);
        }
    }
    public void setInfo(String name, String author,int yearOfPublication){
        try{
            this.name = name;
            this.author = author;
            this.yearOfPublication = yearOfPublication;
        }catch (Exception ex){
            System.err.println(ex);
        }
    }
    public void setInfo(String name, String author,int yearOfPublication, String nameOfThePublishingHouse){
        try{
            this.name = name;
            this.author = author;
            this.yearOfPublication = yearOfPublication;
            this.nameOfThePublishingHouse = nameOfThePublishingHouse;
        }catch (Exception ex){
            System.err.println(ex);
        }
    }
    public void setInfo(String name, String author,int yearOfPublication, String nameOfThePublishingHouse, String genre){
        try{
            this.name = name;
            this.author = author;
            this.yearOfPublication = yearOfPublication;
            this.nameOfThePublishingHouse = nameOfThePublishingHouse;
            this.genre = genre;
        }catch (Exception ex){
            System.err.println(ex);
        }
    }
    public void setInfo(String name, String author,int yearOfPublication, String nameOfThePublishingHouse, String genre, int numberOfPages){
        try{
            this.name = name;
            this.author = author;
            this.yearOfPublication = yearOfPublication;
            this.nameOfThePublishingHouse = nameOfThePublishingHouse;
            this.genre = genre;
            this.numberOfPages = numberOfPages;
        }catch (Exception ex){
            System.err.println(ex);
        }
    }

    public void setName() {
        try{
            System.out.print("\nInput name of book: ");
            this.name = sc.next();
        }catch (Exception ex){
            System.err.println(ex);
        }
    }
    public void setAuthor(){
        try {
            System.out.print("\nInput author of book: ");
            this.author = sc.next();
        }catch (Exception ex){
            System.err.println(ex);

        }
    }

    public void setYearOfPublication(){
        try {
            System.out.print("\nInput year of publication: ");
            this.yearOfPublication = sc.nextInt();
        }catch (Exception ex){
            System.err.println(ex);

        }
    }

    public void setNameOfThePublishingHouse(){
        try {
            System.out.print("\nInput Name of the publishing house: ");
            this.nameOfThePublishingHouse = sc.next();
        }catch (Exception ex){
            System.err.println(ex);

        }
    }
    public void setGenre(){
        try{
            System.out.println("\nInput genre: ");
            this.genre = sc.next();
        }catch (Exception ex){
            System.err.println(ex);
        }
    }

    public void setNumberOfPages() {
        try {
            System.out.print("\nInput number of pages: ");
            this.numberOfPages = sc.nextInt();
        }catch (Exception ex){
            System.err.println(ex);

        }
    }

    public String getFullInfo(){
        return "\nName: "+ name + "\nAuthor: " + author +"\nYear of Publication: " + yearOfPublication + "\nName of the publication house: " + nameOfThePublishingHouse + "\nGenre: " + genre + "\nNumber of pages: " + numberOfPages;
    }

}
