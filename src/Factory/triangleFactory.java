package Factory;

import Figures.Triangle;
import Figures.IFigure;
import Interfaces.IMove;
import Interfaces.IRotate;
import Interfaces.IScale;

public class triangleFactory implements IAbstarctFactory  {
    @Override
    public IFigure createFigure() {
        return new Triangle();
    }

    @Override
    public IMove move() {
        return null;
    }

    @Override
    public IRotate rotate() {
        return null;
    }

    @Override
    public IScale scale() {
        return null;
    }
}
