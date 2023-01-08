import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AssignmentOne {
    public static void main(String[] args) throws IOException {
        Shape shape = new Shape();
        try (BufferedReader br = new BufferedReader(new FileReader("D:\\points.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(" ");
                double x = Double.parseDouble(parts[0]);
                double y = Double.parseDouble(parts[1]);
                Point point = new Point(x, y);
                shape.addPoint(point);
            }
        }
        List<Point> points = shape.getPoints();
        for (Point point : points) {
            System.out.println("(" + point.getX() + ", " + point.getY() + ")");
        }
        System.out.println("Perimeter: " + shape.calculatePerimeter());
        System.out.println("Longest side: " + shape.longestSide());
        System.out.println("Average length: " + shape.averageLength());
    }
}
