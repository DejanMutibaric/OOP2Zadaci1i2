/**
 * 
 */
package geometry;

/**
 * 
 */
public class Line {
	private Point startPoint;
    private Point endPoint;
    private boolean selected;

    // Konstruktor
    public Line(Point startPoint, Point endPoint, boolean selected) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
        this.selected = selected;
    }

    // Getteri i setteri za startPoint
    public Point getStartPoint() {
        return startPoint;
    }

    public void setStartPoint(Point startPoint) {
        this.startPoint = startPoint;
    }

    // Getteri i setteri za endPoint
    public Point getEndPoint() {
        return endPoint;
    }

    public void setEndPoint(Point endPoint) {
        this.endPoint = endPoint;
    }

    // Getteri i setteri za selected
    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }

    // Metoda za računanje dužine linije
    public double length() {
        return Math.sqrt(Math.pow(endPoint.getX() - startPoint.getX(), 2) 
                       + Math.pow(endPoint.getY() - startPoint.getY(), 2));
    }
}