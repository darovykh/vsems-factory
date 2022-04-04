public class CircleFactory {

    public static Circle create(int radius, int x0, int y0) {
        if(radius >= 1) {
            return new Circle(radius, x0, y0);
        }
        return null;
    }

}
