public class Main {

    public static void main(String [] args){
        Circle circle1 = CircleFactory.create(10, 0, 0);
        Circle circle2 = CircleFactory.create(-10, 0, 0);
        System.out.println(circle1);
        System.out.println(circle2);

        Circle circle3 = (Circle) AbstractFigureFactory.create(10, 0, 0, Figure.CIRCLE);
        Rectangle rectangle = (Rectangle) AbstractFigureFactory.create(3, 4, 0, Figure.RECTANGLE);
        System.out.println(circle3);
        System.out.println(rectangle);
    }

}
