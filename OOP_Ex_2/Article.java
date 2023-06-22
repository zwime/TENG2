package OOP_Ex_2;

import OOP_Ex_1.Publication;

public class Article extends Publication {
    private String journal;
    private String doi;

    public Article(String author, String title, String publisher, int year, String journal, String doi) {
        super(author, title, publisher, year);
        this.journal = journal;
        this.doi = doi;
    }

    public String getJournal() {
        return journal;
    }

    public void setJournal(String journal) {
        this.journal = journal;
    }

    public String getDoi() {
        return doi;
    }

    public void setDoi(String doi) {
        this.doi = doi;
    }

    @Override
    public String toString() {
        return super.toString() + " | Journal: " + journal + " | DOI: " + doi;
    }
}
