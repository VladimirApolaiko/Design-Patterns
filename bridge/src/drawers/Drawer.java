package drawers;

public interface Drawer {

	void drawCircle(int x, int y, int radius);

	void gaussBlur(int x0, int y0, int x1, int y1, int x2, int y2, int x3, int y3, int radius);

}