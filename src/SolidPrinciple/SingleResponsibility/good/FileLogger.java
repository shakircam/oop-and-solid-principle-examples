package SolidPrinciple.SingleResponsibility.good;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileLogger {
   public void logError(String error)  {
        File file = new File("error_file_path");
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(file);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}


