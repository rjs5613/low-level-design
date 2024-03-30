package com.github.rjs5613.doceditor;

import java.util.ArrayList;
import java.util.List;
import java.util.SortedSet;

public class Page {

    private final int sequence;
    private final List<Row> rows;
    private final FormatFactory formatFactory;

    public Page(int sequence, FormatFactory formatFactory) {
        this.sequence = sequence;
        this.formatFactory = formatFactory;
        this.rows = new ArrayList<>();
    }

    public void add(int rowNum, int col, char c, String color, int size, SortedSet<Style> styles) {
        Row row = rows.get(rowNum);
        if (null == row) {
            row = new Row(rowNum, formatFactory);
            rows.add(rowNum, row);
        }
        row.add(c, col, color, size, styles);
    }

    public void display() {
        for (Row row : rows) {
            row.display();
        }
    }
}
