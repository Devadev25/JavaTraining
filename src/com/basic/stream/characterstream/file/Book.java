package com.basic.stream.characterstream.file;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Book {

    public static void writeToFile() {
        FileWriter write = null;
        try {
            System.out.println("Enter the file name");
            String fileName=Utility.userInput.nextLine();
            File file = new File(Utility.filePath);
            file.createNewFile();
            write = new FileWriter(file+fileName+Utility.extension, true);

            System.out.println("Enter text to write to the file (enter 'exit' to finish):");
            String input;
            while (!(input = Utility.userInput.nextLine()).equalsIgnoreCase("exit")) {
                write.write(input);
                write.write("\n");
            }
            write.flush();
            System.out.println("Encoding used for writing:" + write.getEncoding());
            System.out.println("Success..");
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        } finally {
            try {
                if (write != null) {
                    write.close();
                }
            } catch (IOException exception) {
                System.out.println(exception.getMessage());
            }
        }
    }
}
