package org.ZapikDimka;

import java.util.List;

/**
 * comment
 */
public class TextProcessor {
    private final TextAnalyzer analyzer;

    public TextProcessor(TextAnalyzer analyzer) {
        this.analyzer = analyzer;
    }

    public String processText(List<String> lines) {
        int wordCount = analyzer.countWords(lines);
        int lineCount = analyzer.countLines(lines);
        return "Line count: " + lineCount + "\nWord count: " + wordCount;
    }
}
