package Factory;

import Figures.Ellipse;
import Figures.IFigure;
import Interfaces.IMove;
import Interfaces.IRotate;
import Interfaces.IScale;

public class ellipseFactory implements IAbstarctFactory {
    @Override
    public IFigure createFigure() {
        return new Ellipse();
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
