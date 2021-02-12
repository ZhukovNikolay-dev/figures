package Factory;

import Figures.Rectangle;
import Interfaces.Figure;

public class rectangleFactory implements IAbstarctFactory  {
    @Override
    public Figure createFigure() {
        return new Rectangle();
    }
}
