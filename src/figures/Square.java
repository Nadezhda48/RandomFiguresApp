package figures;

import figures.interfaces.ISquare;

public class Square implements ISquare {

    private final double sideSquare;
    private final String colorSquare;

    public Square(double sideSquare, String colorSquare){
        this.sideSquare = sideSquare;
        this.colorSquare = colorSquare;
    }

    @Override
    public double getLengthSide() {
        return sideSquare;
    }

    @Override
    public String getColor() {
        return colorSquare;
    }

    @Override
    public double getSquare() {
        return sideSquare*sideSquare;
    }

    @Override
    public String paintFigure() {
        return "The square is drawn";
    }
}
