package figures;

import figures.interfaces.ITrapeze;

public class Trapeze implements ITrapeze {

    private final double downSideTrapeze;
    private final double upperSideTrapeze;
    private final double heightTrapeze;
    private final String colorTrapeze;

    public Trapeze(double downSideTrapeze, double upperSideTrapeze,
                   double heightTrapeze, String colorTrapeze){
        this.downSideTrapeze = downSideTrapeze;
        this.upperSideTrapeze = upperSideTrapeze;
        this.heightTrapeze = heightTrapeze;
        this.colorTrapeze = colorTrapeze;
    }

    @Override
    public double getSmallestSide() {
        if (downSideTrapeze <= upperSideTrapeze && downSideTrapeze <= heightTrapeze) {
            return downSideTrapeze;
        } else if (upperSideTrapeze <= downSideTrapeze && upperSideTrapeze <= heightTrapeze) {
            return upperSideTrapeze;
        } return heightTrapeze;
    }

    @Override
    public String getColor() {
        return colorTrapeze;
    }

    @Override
    public double getSquare() {
        return 0.5 * (downSideTrapeze + upperSideTrapeze) * heightTrapeze;
    }

    @Override
    public String paintFigure() {
        return "The trapeze is drawn";
    }
}
