package com.basic.stream.characterstream.file;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Content {

    public static void displayContent() {
        System.out.println("Search file name");
        String searchFile = Utility.userInput.nextLine();
        try (FileReader contentReader = new FileReader(Utility.filePath + searchFile + Utility.extension)) {
            int count;
            int size = 0;
            while ((count = contentReader.read()) != -1) {
                System.out.print((char) count);
                size++;
            }
            System.out.println("\nLength of characters in book: " + (size));
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }
}
