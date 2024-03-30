package com.github.rjs5613.doceditor;

import java.util.Collections;
import java.util.SortedSet;

public record Format(String color, int size, SortedSet<Style> styles) {

    public Format(String color, int size, SortedSet<Style> styles) {
        this.color = color;
        this.size = size;
        this.styles = Collections.unmodifiableSortedSet(styles);
    }

    @Override
    public String toString() {
        StringBuilder key = new StringBuilder(color + "-" + size);
        for (Style s : styles) {
            key.append("-").append(s);
        }
        return key.toString();
    }
}
