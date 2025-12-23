package com.randa.doc;

public interface Document {
    String getType();
    void render(String content);
    void save(String fileName);
}