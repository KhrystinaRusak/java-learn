package lesson15.shape;

public class ShapeRunner {
    public static void main(String[] args) {
        Shape areOfSquareShape = (x, y) -> x * y;
        areOfSquareShape.getAreaSquare(2, 2);

        Shape areaOfTriangle = (a, h) -> a * h * 0.5;
        System.out.println(areaOfTriangle.getAreaSquare(27, 55));
    }
}
