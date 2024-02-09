package com.basic.stream.characterstream.buffer;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DisplayLog {
    public static void logDetails() {
        BufferedReader read=null;
        try {
            read = new BufferedReader(new FileReader(Utility.filePath));
            String data = "";
            String currentDate = "";
            while ((data = read.readLine()) != null) {
                if(data.contains("Timestamp")){
                    currentDate = data;
                }
                if(data.contains("Username")){
                    System.out.println("User: " + data.substring(10) + " logged in at " + currentDate.substring(11));
                }
            }

        } catch (FileNotFoundException exception) {
            throw new RuntimeException(exception);
        } catch (IOException exception) {
            throw new RuntimeException(exception);
        }finally {
            try{

                read.close();
            }catch (Exception exception){
                System.out.println(exception.getMessage());
            }
        }
    }
}
