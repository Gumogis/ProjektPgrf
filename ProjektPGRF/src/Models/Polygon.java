package Models;

import java.util.ArrayList;

public class Polygon {
    private ArrayList<Point> points;
    public Polygon() {
        points = new ArrayList<>();
    }
    public void addPoint(Point p) {
        points.add(p);
    }
    public ArrayList<Point> getPoints() {
        return points;
    }
    public Point getPoint(int index){
        return points.get(index);
    }
    public int size(){
        return points.size();
    }
}
