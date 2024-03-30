package com.github.rjs5613.doceditor;

import java.util.HashMap;
import java.util.Map;
import java.util.SortedSet;

public final class FormatFactory {

    private final Map<String, Format> formatCache;

    public FormatFactory() {
        formatCache = new HashMap<>();
    }

    public Format get(String color, int size, SortedSet<Style> styles) {
        StringBuilder key = new StringBuilder(color + "-" + size);
        for (Style s : styles) {
            key.append("-").append(s);
        }
        return formatCache.computeIfAbsent(key.toString(), k -> new Format(color, size, styles));
    }
}
