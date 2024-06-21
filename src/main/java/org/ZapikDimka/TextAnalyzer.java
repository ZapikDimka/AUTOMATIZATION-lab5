package org.ZapikDimka;

import java.util.List;

/**
 * comment
 */
public class TextAnalyzer {
    public int countWords(List<String> lines) {
        int wordCount = 0;
        for (String line : lines) {
            wordCount += line.split("\\s+").length;
        }
        return wordCount;
    }

    public int countLines(List<String> lines) {
        return lines.size();
    }
}
