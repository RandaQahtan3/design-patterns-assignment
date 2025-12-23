package com.randa.doc.formats;

import com.randa.doc.Document;

public class PdfDocument implements Document {
    @Override
    public String getType() { return "PDF"; }

    @Override
    public void render(String content) {
        System.out.println("[PDF] Rendering content: " + content);
    }

    @Override
    public void save(String fileName) {
        System.out.println("[PDF] Saved as: " + fileName);
    }
}