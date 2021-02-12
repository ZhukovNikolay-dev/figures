package Factory;

import Figures.Triangle;
import Interfaces.Figure;

public class triangleFactory implements IAbstarctFactory  {
    @Override
    public Figure createFigure() {
        return new Triangle();
    }
}
