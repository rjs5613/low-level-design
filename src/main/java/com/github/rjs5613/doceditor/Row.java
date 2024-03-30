package com.github.rjs5613.doceditor;

import java.util.ArrayList;
import java.util.List;
import java.util.SortedSet;

public class Row {

    private final int rowNum;
    private final List<FormattedCharacter> formattedChars;
    private final FormatFactory formatFactory;

    public Row(int rowNum, FormatFactory formatFactory) {
        this.rowNum = rowNum;
        this.formatFactory = formatFactory;
        this.formattedChars = new ArrayList<>();
    }

    public void add(char c, int col, String color, int size, SortedSet<Style> styles) {
        FormattedCharacter fc = new FormattedCharacter(c, formatFactory.get(color, size, styles));
        formattedChars.add(col, fc);
    }

    public void display() {
        for (FormattedCharacter fc : formattedChars) {
            fc.display();
        }
    }

    public int rowNum() {
        return rowNum;
    }
}
