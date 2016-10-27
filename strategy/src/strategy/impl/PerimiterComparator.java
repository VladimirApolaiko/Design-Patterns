package strategy.impl;

import figure.Rectangle;
import strategy.Comparator;

/**
 * Created by vladimir on 10/25/16.
 */
public class PerimiterComparator implements Comparator {

    @Override
    public boolean equals(Rectangle p1, Rectangle p2) {
        return (p1.a1 + p1.a2 + p1.a3 + p1.a4) == (p2.a1 + p2.a2 + p2.a3 + p2.a4);
    }
}
