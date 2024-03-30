package com.github.rjs5613.doceditor;

import java.util.ArrayList;
import java.util.List;
import java.util.SortedSet;

public class Document extends Observable {

    private final FormatFactory formatFactory = new FormatFactory();
    private final String name;
    private final List<Page> pages;

    public Document(String name) {
        this.name = name;
        this.pages = new ArrayList<>();
    }

    public void add(int pageNum, int row, int col, char c, String color, int size, SortedSet<Style> styles) {
        Page page = pages.get(pageNum);
        if (null == page) {
            page = new Page(pageNum, formatFactory);
            pages.add(pageNum, page);
        }
        page.add(row, col, c, color, size, styles);
        notifyObservers();
    }

    public void display() {
        for (Page page : pages) {
            page.display();
        }
    }

    public String name() {
        return name;
    }
}
