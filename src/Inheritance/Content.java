package Inheritance;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Content {
    String contentTitle;
    String contentDescription;

    public Content(String contentTitle, String contentDescription) {
        this.contentTitle = contentTitle;
        this.contentDescription = contentDescription;
    }

    void saveContent(Content content){
        File file = new File("file_path");
        try {
            // Create a FileWriter and pass the file as an argument
            FileWriter fileWriter = new FileWriter(file);

            // Write the content to the file
            fileWriter.write(content.toString());

            // Close the FileWriter to flush and close the file
            fileWriter.close();

            System.out.println("Content saved to " + file.getAbsolutePath());
        } catch (IOException e) {
            System.err.println("Error saving content: " + e.getMessage());
        }
    }
}
