package drawers.impl;

import drawers.Drawer;

public class SmallCircleDrawer implements Drawer {

    public static final double radiusMultiplier = 0.25;

    @Override
    public void drawCircle(int x, int y, int radius) {
        System.out.println("Small circle center = " + x + "," + y + " radius = " + radius * radiusMultiplier);
    }

    @Override
    public void gaussBlur(int x0, int y0, int x1, int y1, int radius) {
        System.out.println("Gauss blur in area (" + x0 + ";" + y0 +") & (" + x1 + ";" + y1 + ") with radius " + radius);
    }

}