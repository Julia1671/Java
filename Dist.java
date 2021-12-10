//HW2 3.25
public class Dist {
    public double toPoint (double x1, double y1, double x2, double y2) {
        double dist = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
        return dist;
    }
    public double toLine (double a, double b, double c, double x0, double y0) {
        double dist = Math.abs(a * x0 + b * y0 + c) / Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        return dist;
    }
    public double toLineCrossing(double a1, double b1, double c1, double a2, double b2, double c2, double x, double y) {
        double y0 = (a1 * c2 - a2 * c1) / (a2 * b1 - a1 * b2);
        double x0 = -1 * (c2 + b2 * y0) / a2;
        return toPoint(x0,y0, x, y);

    }
}