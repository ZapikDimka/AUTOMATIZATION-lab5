package org.ZapikDimka;

import java.io.IOException;
import java.util.List;

/**
 * comment
 */
public class ZapikDimka_TextFileProcessor {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.err.println("Usage: java -jar Task5.jar <input file> <output file>");
            System.exit(1);
        }

        String inputFile = args[0];
        String outputFile = args[1];

        ZapikDimka_FileReader fileReader = new ZapikDimka_FileReader();
        ZapikDimka_TextAnalyzer textAnalyzer = new ZapikDimka_TextAnalyzer();
        ZapikDimka_TextProcessor textProcessor = new ZapikDimka_TextProcessor(textAnalyzer);
        ZapikDimka_FileWriter fileWriter = new ZapikDimka_FileWriter();

        try {
            List<String> lines = fileReader.readLines(inputFile);
            String result = textProcessor.processText(lines);
            fileWriter.writeToFile(outputFile, result);
            System.out.println("Analysis complete. Results written to " + outputFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
