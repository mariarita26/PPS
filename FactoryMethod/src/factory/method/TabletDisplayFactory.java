package factory.method;

import factory.factories.StandardDisplayFactory;
import factory.gadgets.TabletDisplay;

public class TabletDisplayFactory extends StandardDisplayFactory {

    @Override
    protected StandardDisplay createDisplay(double inches) {

        return new TabletDisplay(inches);
    }

}
