package com.randa.doc.formats;

import com.randa.doc.Document;

public class HtmlDocument implements Document {
    @Override
    public String getType() { return "HTML"; }

    @Override
    public void render(String content) {
        System.out.println("[HTML] Rendering content: " + content);
    }

    @Override
    public void save(String fileName) {
        System.out.println("[HTML] Saved as: " + fileName);
    }
}