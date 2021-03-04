package Factory;

import Figures.Rectangle;
import Figures.IFigure;
import Interfaces.IMove;
import Interfaces.IRotate;
import Interfaces.IScale;

public class rectangleFactory implements IAbstarctFactory  {
    @Override
    public IFigure createFigure() {
        return new Rectangle();
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
