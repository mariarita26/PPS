package factory.factories;

import factory.gadgets.SmartphoneDisplay;
import factory.method.StandardDisplay;

public class SmartphoneDisplayFactory extends StandardDisplayFactory {

        @Override
        protected StandardDisplay createDisplay(double inches) {
            return new SmartphoneDisplay(inches);
    }
}
