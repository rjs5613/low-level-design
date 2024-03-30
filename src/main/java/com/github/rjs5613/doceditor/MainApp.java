package com.github.rjs5613.doceditor;

import java.util.Collections;

public class MainApp {

    public static void main(String[] args) {

        Document doc = new Document("MyDoc");
        doc.add(0, 0, 0, 'c', "Red", 15, Collections.emptySortedSet());
        doc.add(0, 0, 1, 'c', "Red", 15, Collections.emptySortedSet());
        doc.add(0, 0, 2, 'c', "Red", 15, Collections.emptySortedSet());

        doc.display();

    }

}
