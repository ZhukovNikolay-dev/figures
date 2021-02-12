package Factory;

import Figures.Ellipse;
import Interfaces.Figure;

public class ellipseFactory implements IAbstarctFactory {
    @Override
    public Figure createFigure() {
        return new Ellipse();
    }
}
