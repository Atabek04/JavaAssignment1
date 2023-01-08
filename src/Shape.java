import java.util.List;
import java.util.ArrayList;

public class Shape {
    private List<Point> points;

    public Shape() {
        points = new ArrayList<>();
    }

    public void addPoint(Point point) {
        points.add(point);
    }

    public List<Point> getPoints() {
        return points;
    }

    public double calculatePerimeter() {
        double perimeter = 0.0;
        for (int i = 0; i < points.size()-1; i++) {
            perimeter += points.get(i).distance(points.get(i+1));
        }
        perimeter += points.get(points.size()-1).distance(points.get(0));
        return perimeter;
    }

    public double longestSide() {
        double longest = 0.0;
        for (int i = 0; i < points.size()-1; i++) {
            double sideLength = points.get(i).distance(points.get(i+1));
            if (sideLength > longest) {
                longest = sideLength;
            }
        }
        double lastSideLength = points.get(points.size()-1).distance(points.get(0));
        if (lastSideLength > longest) {
            longest = lastSideLength;
        }
        return longest;
    }

    public double averageLength() {
        double sum = 0.0;
        for (int i = 0; i < points.size()-1; i++) {
            sum += points.get(i).distance(points.get(i+1));
        }
        sum += points.get(points.size()-1).distance(points.get(0));
        return sum / points.size();
    }
}
