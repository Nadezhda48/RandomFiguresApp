package figures;

import figures.interfaces.ITriangle;

public class Triangle implements ITriangle {

    private final double firstSideTriangle;
    private final double secondSideTriangle;
    private final double thirdSideTriangle;
    private final String colorTriangle;


    public Triangle(double firstSideTriangle, double secondSideTriangle,
                    double thirdSideTriangle, String colorTriangle){
        this.firstSideTriangle = firstSideTriangle;
        this.secondSideTriangle = secondSideTriangle;
        this.thirdSideTriangle = thirdSideTriangle;
        this.colorTriangle = colorTriangle;
    }

    @Override
    public double getHypotenuseLength() {
        if (firstSideTriangle >= secondSideTriangle && firstSideTriangle >= thirdSideTriangle){
            return firstSideTriangle;
        } else if (secondSideTriangle >= firstSideTriangle && secondSideTriangle >= thirdSideTriangle){
            return secondSideTriangle;
        }   return thirdSideTriangle;
    }

    @Override
    public String getColor() {
        return colorTriangle;
    }

    @Override
    public double getSquare() {
        double halfPerimeter = (firstSideTriangle + secondSideTriangle + thirdSideTriangle) / 2;
        return Math.sqrt(halfPerimeter * (halfPerimeter - firstSideTriangle) *
                (halfPerimeter - secondSideTriangle) * (halfPerimeter - thirdSideTriangle));
    }

    @Override
    public String paintFigure() {
        return "The triangle is drawn";
    }
}
