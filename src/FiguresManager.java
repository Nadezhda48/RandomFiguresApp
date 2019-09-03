import interfaces.IFigure;
import java.util.Random;

class FiguresManager {
    private Random random;

    IFigure[] getRandomGeneratedFigures(){
        random = new Random();
        IFigure[] array = new IFigure[countOfObjects()];

        for (int i = 0; i< array.length; i++){
            array[i] = getRandomFigure();
        }
        return array;
    }

    private IFigure getRandomFigure() {
        int randomNumber = random.nextInt(4);
        if (randomNumber == 0){
            return new Circle(getRandomDoubleValue(), getRandomColor());
        } else if (randomNumber == 1){
            return new Square(getRandomDoubleValue(), getRandomColor());
        } else if (randomNumber == 2){
            return new Trapeze(getRandomDoubleValue(), getRandomDoubleValue(),
                               getRandomDoubleValue(),getRandomColor());
        } else
            return new Triangle(getRandomDoubleValue(), getRandomDoubleValue(),
                                getRandomDoubleValue(),getRandomColor());
    }

    private int countOfObjects(){
        return random.nextInt(100);
    }

    private double getRandomDoubleValue(){
        double min = 0.1;
        double max = 100.0;
        return min + (max - min) * random.nextDouble();
    }

    private String getRandomColor(){
        String [] arrayColor = {"Green", "Black", "White", "Yellow", "Blue",
                                "Red", "Gray", "Orange"};
        return arrayColor[random.nextInt(arrayColor.length)];
    }
}
