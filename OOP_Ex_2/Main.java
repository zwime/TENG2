package OOP_Ex_2;

import OOP_Ex_1.Publication;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DataContainer dataContainer = new DataContainer();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("Enter a command:");
            String command = scanner.nextLine();

            if (command.startsWith("add")) {
                String[] parts = command.split(" ");
                if (parts.length == 2) {
                    String objectType = parts[1].toLowerCase();
                    Publication publication = DataContainer.createPublication(scanner, objectType);
                    dataContainer.add(publication);
                    System.out.println("Object added successfully.");
                } else {
                    System.out.println("Invalid command. Usage: add Publication/Paper/Article");
                }
            } else if (command.equals("size")) {
                int size = dataContainer.size();
                System.out.println(size + " elements are currently stored.");
            } else if (command.startsWith("rm")) {
                String[] parts = command.split(" ");
                if (parts.length == 2) {
                    int id = Integer.parseInt(parts[1]);
                    if (id >= 1 && id <= dataContainer.size()) {
                        dataContainer.deleteObject(id - 1);
                        System.out.println("Object deleted successfully.");
                    } else {
                        System.out.println("Number does not exist. Size = " + dataContainer.size());
                    }
                } else {
                    System.out.println("Invalid command. Usage: rm <id>");
                }
            } else if (command.startsWith("print")) {
                String[] parts = command.split(" ");
                if (parts.length == 2) {
                    int id = Integer.parseInt(parts[1]);
                    if (id >= 1 && id <= dataContainer.size()) {
                        Publication publication = dataContainer.getObject(id - 1);
                        System.out.println("Type: " + DataContainer.getPublicationType(publication));
                        System.out.println(publication);
                    } else {
                        System.out.println("Number does not exist. Size = " + dataContainer.size());
                    }
                } else {
                    System.out.println("Invalid command. Usage: print <id>");
                }
            } else if (command.equals("printAll")) {
                DataContainer.printPublications(dataContainer);
            } else if (command.startsWith("set")) {
                String[] parts = command.split(" ");
                if (parts.length == 2) {
                    int id = Integer.parseInt(parts[1]);
                    if (id >= 1 && id <= dataContainer.size()) {
                        Publication publication = DataContainer.createPublication(scanner, DataContainer.getPublicationType(dataContainer.getObject(id - 1)).toLowerCase());
                        dataContainer.setObject(id - 1, publication);
                        System.out.println("Object updated successfully.");
                    } else {
                        System.out.println("Number does not exist. Size = " + dataContainer.size());
                    }
                } else {
                    System.out.println("Invalid command. Usage: set <id>");
                }
            } else if (command.equals("quit")) {
                running = false;
            } else {
                System.out.println("Invalid command. Please try again.");
            }
        }

        scanner.close();
        System.out.println("Program ended. Data cleaned up.");
    }
}
