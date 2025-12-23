package com.randa.doc;

import com.randa.doc.formats.DocumentFactory;

public class DocumentEditor {

    public void process(String selectedType, String content, String outputFileName) {

        Document document =
                DocumentFactory.createDocument(selectedType);

        document.render(content);
        document.save(outputFileName);
    }
}