package com.randa.doc.formats;

import com.randa.doc.Document;

public class DocumentFactory {

    public static Document create(String type) {
        if (type == null) throw new IllegalArgumentException("type is null");

        return switch (type.toUpperCase()) {
            case "PDF" -> new PdfDocument();
            case "HTML" -> new HtmlDocument();
            case "WORD" -> new WordDocument();
            default -> throw new IllegalArgumentException("Unknown document type: " + type);
        };
    }

    public static Document createDocument(String selectedType) {
        return null;
    }
}