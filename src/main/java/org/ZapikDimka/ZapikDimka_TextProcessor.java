package org.ZapikDimka;

import java.util.List;

/**
 * comment
 */
public class ZapikDimka_TextProcessor {
    private final ZapikDimka_TextAnalyzer analyzer;

    public ZapikDimka_TextProcessor(ZapikDimka_TextAnalyzer analyzer) {
        this.analyzer = analyzer;
    }

    public String processText(List<String> lines) {
        int wordCount = analyzer.countWords(lines);
        int lineCount = analyzer.countLines(lines);
        return "Line count: " + lineCount + "\nWord count: " + wordCount;
    }
}
