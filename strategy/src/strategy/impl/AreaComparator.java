package strategy.impl;

import figure.Rectangle;
import strategy.Comparator;

/**
 * Created by vladimir on 10/25/16.
 */
public class AreaComparator implements Comparator {

    @Override
    public boolean equals(Rectangle p1, Rectangle p2) {
        return (p1.a1 * p1.a4) == (p2.a1 * p2.a4);
    }
}
