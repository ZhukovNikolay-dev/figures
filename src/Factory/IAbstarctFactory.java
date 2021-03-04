package Factory;

import Figures.IFigure;
import Interfaces.IMove;
import Interfaces.IRotate;
import Interfaces.IScale;

public interface IAbstarctFactory {
    IFigure createFigure();
    IMove move();
    IRotate rotate();
    IScale scale();

}
