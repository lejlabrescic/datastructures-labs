package Homework1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileUtils {

    public static ArrayList<String> readFile(String filePath) {
        ArrayList<String> lines = new ArrayList<>();
        try {
            List<String> fileLines = Files.readAllLines(Paths.get(filePath));
            lines.addAll(fileLines);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lines;
    }
}
