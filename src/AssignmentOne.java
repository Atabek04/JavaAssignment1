import java.util.List;

public class AssignmentOne {
    public static void main(String[] args) {
        Shape shape = new Shape();

        // read points from file and add them to the shape
        // ...

        List<Point> points = shape.getPoints();
        double perimeter = shape.calculatePerimeter();
        double longestSide = shape.getLongestSide();
        double averageLength = shape.getAverageLength();
    }
}
