/**
 * 
 */
package geometry;

/**
 * 
 */
public class Rectangle {
	private Point upperLeftPoint;
    private int width;
    private int height;
    private boolean selected;

    // Konstruktor
    public Rectangle(Point upperLeftPoint, int width, int height, boolean selected) {
        this.upperLeftPoint = upperLeftPoint;
        this.width = width;
        this.height = height;
        this.selected = selected;
    }

    // Getteri i setteri za upperLeftPoint
    public Point getUpperLeftPoint() {
        return upperLeftPoint;
    }

    public void setUpperLeftPoint(Point upperLeftPoint) {
        this.upperLeftPoint = upperLeftPoint;
    }

    // Getteri i setteri za width
    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    // Getteri i setteri za height
    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    // Getteri i setteri za selected
    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }

    // Metoda za računanje površine
    public int area() {
        return width * height;
    }

    // Metoda za računanje obima
    public int circumference() {
        return 2 * (width + height);
    }
}
