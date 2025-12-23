package com.randa.doc.formats;

import com.randa.doc.Document;

public class WordDocument implements Document {
    @Override
    public String getType() { return "WORD"; }

    @Override
    public void render(String content) {
        System.out.println("[WORD] Rendering content: " + content);
    }

    @Override
    public void save(String fileName) {
        System.out.println("[WORD] Saved as: " + fileName);
    }
}