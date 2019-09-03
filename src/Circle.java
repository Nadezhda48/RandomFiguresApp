import interfaces.ICircle;

public class Circle implements ICircle {

    private final double radiusCircle;
    private final String colorCircle;
    private final static double PI = 3.14;

    Circle(double radiusCircle, String colorCircle){
        this.radiusCircle = radiusCircle;
        this.colorCircle = colorCircle;
    }

    @Override
    public double getRadius() {
        return radiusCircle;
    }

    @Override
    public String getColor() {
        return colorCircle;
    }

    @Override
    public double getSquare() {
        return PI*radiusCircle*radiusCircle;
    }

    @Override
    public String paintFigure() {
        return "The Circle is drawn";
    }
}
