public class Publication {
    private String author;
    private String title;
    private String publisher;
    private int year;

    public Publication(String author, String title, String publisher, int year) {
        this.author = author;
        this.title = title;
        this.publisher = publisher;
        this.year = year;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Type: Publication | Author: " + author + " | Title: " + title + " | Publisher: " + publisher + " | Year: " + year;
    }

    public static void main(String[] args) {
        Publication p = new Publication("Fritz", "what's the title", "publisher1", 2020);
        p.setAuthor("Sepp");
        System.out.println(p);
    }
}
