package Factory;

import Figures.Rhombus;
import Interfaces.Figure;

public class rhombusFactory implements IAbstarctFactory  {
    @Override
    public Figure createFigure() {
        return new Rhombus();
    }
}
