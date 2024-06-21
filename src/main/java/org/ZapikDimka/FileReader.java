package org.ZapikDimka;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

/**
 * comment
 */
public class FileReader {
    public List<String> readLines(String filePath) throws IOException {
        return Files.readAllLines(Paths.get(filePath));
    }
}
