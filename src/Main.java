import figures.interfaces.*;

public class Main{

    public static void main(String[] args) {
        FiguresManager figuresManager = new FiguresManager();

        for (IFigure outputFigures : figuresManager.getRandomGeneratedFigures()){
            if (outputFigures instanceof ISquare){
                System.out.println("Figure type - Square. "  + outputFigures.paintFigure() + ", " + "color: " +
                        outputFigures.getColor() + ", " + "square: " + outputFigures.getSquare() + ", length side: " +
                        ((ISquare) outputFigures).getLengthSide());
            } else if (outputFigures instanceof ICircle){
                    System.out.println("Figure type - Circle. " + outputFigures.paintFigure() + ", " + "color: " +
                        outputFigures.getColor() + ", " + "square: " + outputFigures.getSquare() + ", radius: " +
                        ((ICircle) outputFigures).getRadius());
            } else if (outputFigures instanceof ITriangle){
                    System.out.println("Figure type - Triangle. " + outputFigures.paintFigure() + ", " + "color: " +
                        outputFigures.getColor() + ", " + "square: " + outputFigures.getSquare() + ", hypotenuse: " +
                        ((ITriangle) outputFigures).getHypotenuseLength());
            } else if (outputFigures instanceof ITrapeze){
                    System.out.println("Figure type - Trapeze. " + outputFigures.paintFigure() + ", " + "color: " +
                        outputFigures.getColor() + ", " + "square: " + outputFigures.getSquare() + ", smallest side: " +
                        ((ITrapeze) outputFigures).getSmallestSide());
            }
        }
    }
}
