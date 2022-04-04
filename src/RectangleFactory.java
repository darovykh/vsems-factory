public class RectangleFactory {

    public static Rectangle create(int a, int b) {

        if(a > 0 && b > 0) {
            return new Rectangle(a, b);
        }

        return null;
    }
}
