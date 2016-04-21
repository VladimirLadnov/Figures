package dz.module2;

/**
 * Created by Володимир on 19.04.2016.
 */
public class Triangle extends Figure {
    private double osnova;
    private double high;

    public void setOsnova(double osnova) {
        this.osnova = osnova;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    @Override
    public double getSquare() {
        return 0.5 * osnova * high;
    }
}
