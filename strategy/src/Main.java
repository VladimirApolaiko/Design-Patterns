import figure.Rectangle;
import strategy.impl.AreaComparator;

public class Main {
    public static void main(String[] args) {
        try {
            Rectangle rec1 = new Rectangle(10, 5, 10, 5); // set method of equality of objects, STANDART is default implementation
            rec1.setEqual(new AreaComparator());
            Rectangle rec2 = new Rectangle(10, 5, 10, 5);

            System.out.println(rec1.equals(rec2));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}