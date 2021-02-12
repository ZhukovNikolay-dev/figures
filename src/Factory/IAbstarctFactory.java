package Factory;

import Figures.Ellipse;
import Figures.Rectangle;
import Figures.Rhombus;
import Figures.Triangle;
import Interfaces.Figure;

public interface IAbstarctFactory {
    Figure createFigure();

}
