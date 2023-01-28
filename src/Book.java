public class Book {
    private String name;
    private String authorName;
    private int year;
    private int price;

    public Book(String name, String authorName, int year, int price) {
        this.name = name;
        this.authorName = authorName;
        this.year = year;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getAuthorName() {
        return authorName;
    }

    public int getYear() {
        return year;
    }

    public int getPrice() {
        return price;
    }
}
