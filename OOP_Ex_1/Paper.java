package OOP_Ex_1;

public class Paper extends Publication {
    private String conference;
    private String doi;

    public Paper(String author, String title, String publisher, int year, String conference, String doi) {
        super(author, title, publisher, year);
        this.conference = conference;
        this.doi = doi;
    }

    public String getConference() {
        return conference;
    }

    public void setConference(String conference) {
        this.conference = conference;
    }

    public String getDoi() {
        return doi;
    }

    public void setDoi(String doi) {
        this.doi = doi;
    }

    @Override
    public String toString() {
        return "Type: Publication | Author: " + getAuthor() + " | Title: " + getTitle() +
                " | Conference: " + getConference() + " | Publisher: " + getPublisher() +
                " | Year: " + getYear() + " | DOI: " + getDoi();
    }

    public static void main(String[] args) {
        Paper p = new Paper("Fritz", "whats the title", "publisher1", 2020,
                "5th int. conf. on whatever", "DOI0000");
        p.setAuthor("Sepp");
        p.setDoi("DOI4711");
        System.out.println(p);
    }
}
