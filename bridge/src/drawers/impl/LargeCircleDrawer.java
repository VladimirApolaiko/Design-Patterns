package drawers.impl;

import drawers.Drawer;

import javax.naming.OperationNotSupportedException;

public class LargeCircleDrawer implements Drawer {

	public static final int radiusMultiplier = 10;

	@Override
    public void drawCircle(int x, int y, int radius) {
		System.out.println("Large circle center = " + x + "," + y + " radius = " + radius*radiusMultiplier);
	}

	@Override
	public void gaussBlur(int x0, int y0, int x1, int y1, int radius) {
		throw new UnsupportedOperationException();
	}

}