package figure;

import strategy.Comparator;
import strategy.impl.PerimiterComparator;

public class Rectangle {
    //For economy of memory I could to do only two sides of rectangle,
    // but I'd like to show all four sides here
    public int a1;
    public int a2;
    public int a3;
    public int a4;

    private Comparator equalStrategy;

    public Rectangle(int a1, int a2, int a3, int a4) throws Exception {
        if ((a1 != a3) || (a2 != a4)) throw new IllegalArgumentException("Edges should be equals");

        this.equalStrategy = new PerimiterComparator();

        this.a1 = a1;
        this.a2 = a2;
        this.a3 = a3;
        this.a4 = a4;
    }

    public void setEqual(Comparator equal) {
        this.equalStrategy = equal;
    }

    public boolean equals(Object o) {
        return this.equalStrategy.equals(this, (Rectangle) o);
    }
}