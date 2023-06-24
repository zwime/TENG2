package OOP_Ex_2;

import OOP_Ex_1.Publication;
import OOP_Ex_1.Paper;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DataContainer {
    private final List<Publication> data = new ArrayList<>();

    public int size() {
        return data.size();
    }

    public void add(Publication object) {
        data.add(object);
    }

    public Publication getObject(int id) {
        return data.get(id);
    }

    public void setObject(int id, Publication object) {
        data.set(id, object);
    }

    public void deleteObject(int id) {
        data.remove(id);
    }

    public static String getPublicationType(Publication publication) {
        if (publication instanceof Paper) {
            return "Paper";
        } else if (publication instanceof Article) {
            return "Article";
        } else {
            return "Publication";
        }
    }

    public static void printPublications(DataContainer dataContainer) {
        for (int i = 0; i < dataContainer.size(); i++) {
            Publication publication = dataContainer.getObject(i);
            System.out.println("Type: " + getPublicationType(publication));
            System.out.println(publication);
        }
    }

    public static Publication createPublication(Scanner scanner, String objectType) {
        System.out.println("Enter the author:");
        String author = scanner.nextLine();

        System.out.println("Enter the title:");
        String title = scanner.nextLine();

        System.out.println("Enter the publisher:");
        String publisher = scanner.nextLine();

        System.out.println("Enter the year:");
        int year = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        if (objectType.equals("paper")) {
            System.out.println("Enter the conference:");
            String conference = scanner.nextLine();

            System.out.println("Enter the DOI:");
            String doi = scanner.nextLine();

            return new Paper(author, title, publisher, year, conference, doi);
        } else if (objectType.equals("article")) {
            System.out.println("Enter the journal:");
            String journal = scanner.nextLine();

            System.out.println("Enter the DOI:");
            String doi = scanner.nextLine();

            return new Article(author, title, publisher, year, journal, doi);
        } else {
            return new Publication(author, title, publisher, year);
        }
    }
}
