package com.basic.stream.characterstream.buffer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class Login {
    public static void entry() {
        BufferedWriter userEntry = null;
        try {
            userEntry = new BufferedWriter(new FileWriter(Utility.filePath, true));
            System.out.println("Welcome");
            System.out.println("Enter your username : ");
            String userName = Utility.userInput.next();
            Utility.userInput.nextLine();
            System.out.println("Enter your Password : ");
            String password = Utility.userInput.next();

            // Get current timestamp with timezone
            String currentTimestamp = new Date().toString();
            // Write user login details along with timestamp to the file
            userEntry.write("Timestamp: " + currentTimestamp + System.lineSeparator());
            userEntry.write("Username: " + userName + "\n");
            userEntry.write("Password: " + password + "\n");
            userEntry.write(System.lineSeparator());
            userEntry.flush();
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        } finally {
            try {
                if (userEntry != null) {
                    userEntry.close();
                }
            } catch (IOException exception) {
                exception.printStackTrace();
            }
        }
    }
}
