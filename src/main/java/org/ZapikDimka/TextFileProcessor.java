package org.ZapikDimka;

import java.io.IOException;
import java.util.List;

/**
 * comment
 */
public class TextFileProcessor {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.err.println("Usage: java -jar Task5.jar <input file> <output file>");
            System.exit(1);
        }

        String inputFile = args[0];
        String outputFile = args[1];

        FileReader fileReader = new FileReader();
        TextAnalyzer textAnalyzer = new TextAnalyzer();
        TextProcessor textProcessor = new TextProcessor(textAnalyzer);
        FileWriter fileWriter = new FileWriter();

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
