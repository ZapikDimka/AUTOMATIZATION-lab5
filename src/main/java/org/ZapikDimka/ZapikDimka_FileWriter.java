package org.ZapikDimka;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * comment
 */
public class ZapikDimka_FileWriter {
    public void writeToFile(String filePath, String content) throws IOException {
        Files.write(Paths.get(filePath), content.getBytes());
    }
}
