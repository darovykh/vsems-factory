public class AbstractFigureFactory {

    public static IFigure create(int a, int b, int c, Figure figure) {

        if(figure.equals(Figure.CIRCLE)) {
            return CircleFactory.create(a, b, c);
        }

        if(figure.equals(Figure.RECTANGLE)) {
            return  RectangleFactory.create(a, b);
        }

        return null;
    }

}
