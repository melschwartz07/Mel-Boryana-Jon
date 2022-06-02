package contacts;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public interface Main {
    static void main(String args[]) throws IOException {
        //        create directory & file
        String directory = "contacts";
        String filename = "contacts.txt";

        Path myDirectory = Paths.get(directory);
        Path myFile = Paths.get(directory, filename);
//        System.out.println(myDirectory);
//        System.out.println(myFile);

        if (Files.notExists(myDirectory)) {
            Files.createDirectories(myDirectory);
        }

        if (! Files.exists(myFile)) {
            Files.createFile(myFile);
        }

//        writeToFile();
//        readFileContents();

        while (true) {
            int userChoice = MobilePhone.mainMenu();
            if (userChoice == 1)
                MobilePhone.viewContacts();
            else if (userChoice == 2)
                MobilePhone.addContact();
            else if (userChoice == 3)
                MobilePhone.searchContact();
            else if (userChoice == 4) {
                MobilePhone.deleteContact();
            } else if (userChoice == 5) {
                MobilePhone.exit();
            } else
                System.out.println("Try again");
        }
    }
}