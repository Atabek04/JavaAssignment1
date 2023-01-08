import java.util.ArrayList;
import java.util.List;

class Shape {
    private final List<Point> points;

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
        double perimeter = 0;
        for (int i = 0; i < points.size(); i++) {
            Point current = points.get(i);
            Point next = points.get((i + 1) % points.size());
            perimeter += current.distance(next);
        }
        return perimeter;
    }

    public double getLongestSide() {
        double longest = 0;
        for (int i = 0; i < points.size(); i++) {
            Point current = points.get(i);
            Point next = points.get((i + 1) % points.size());
            double distance = current.distance(next);
            if (distance > longest) {
                longest = distance;
            }
        }
        return longest;
    }

    public double getAverageLength() {
        return calculatePerimeter() / points.size();
    }
}