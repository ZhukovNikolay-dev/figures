package Factory;

import Figures.Rhombus;
import Figures.IFigure;
import Interfaces.IMove;
import Interfaces.IRotate;
import Interfaces.IScale;

public class rhombusFactory implements IAbstarctFactory  {
    @Override
    public IFigure createFigure() {
        return new Rhombus();
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
